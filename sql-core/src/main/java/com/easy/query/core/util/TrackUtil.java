package com.easy.query.core.util;

import com.easy.query.core.abstraction.metadata.ColumnMetadata;
import com.easy.query.core.abstraction.metadata.EntityMetadata;
import com.easy.query.core.abstraction.metadata.EntityMetadataManager;
import com.easy.query.core.exception.EasyQueryException;
import com.easy.query.core.expression.lambda.Property;
import com.easy.query.core.expression.lambda.TrackKeyFunc;
import com.easy.query.core.track.EntityState;
import com.easy.query.core.track.TrackDiffEntry;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @FileName: TrackUtil.java
 * @Description: 文件说明
 * @Date: 2023/3/19 21:36
 * @Created by xuejiaming
 */
public class TrackUtil {
    private static final ConcurrentHashMap<Class<?>, TrackKeyFunc<Object>> trackKeyFuncMap = new ConcurrentHashMap<>();

    /**
     * 返回未null表示当前对象没有追踪key无法追踪
     *
     * @param entityMetadataManager
     * @param entity
     * @return
     */
    public static String getTrackKey(EntityMetadataManager entityMetadataManager, Object entity) {
        //构建获取对象追踪key表达式缓存
        TrackKeyFunc<Object> entityTrackKeyFunc = trackKeyFuncMap.computeIfAbsent(entity.getClass(), k -> {
            EntityMetadata entityMetadata = entityMetadataManager.getEntityMetadata(entity.getClass());
            Collection<String> keyProperties = entityMetadata.getKeyProperties();

            ArrayList<Property<Object, ?>> properties = new ArrayList<>(keyProperties.size());
            for (String keyProperty : keyProperties) {
                ColumnMetadata columnMetadata = entityMetadata.getColumnNotNull(keyProperty);
                Property<Object, ?> lambdaProperty = EasyUtil.getPropertyLambda(entity.getClass(), keyProperty, columnMetadata.getProperty().getPropertyType());
                properties.add(lambdaProperty);
            }
            return o -> {
                if (ArrayUtil.isEmpty(properties)) {
                    return null;
                }
                StringBuilder trackKey = new StringBuilder();

                Iterator<Property<Object, ?>> iterator = properties.iterator();
                Property<Object, ?> firstProperty = iterator.next();
                trackKey.append(firstProperty.apply(o));
                while (iterator.hasNext()) {
                    trackKey.append(",").append(iterator.next().apply(o));
                }
                return trackKey.toString();
            };
        });
        return entityTrackKeyFunc.get(entity);
    }

    /**
     * 获取追踪不一样的属性
     * @param entityMetadataManager
     * @param entityState
     * @return
     */

    public static Map<String, TrackDiffEntry> getTrackDiffProperty(EntityMetadataManager entityMetadataManager, EntityState entityState) {
        Class<?> entityClass = entityState.getEntityClass();
        EntityMetadata entityMetadata = entityMetadataManager.getEntityMetadata(entityClass);

        Map<String, TrackDiffEntry> diffProperties =new LinkedHashMap<>();
        Collection<String> properties = entityMetadata.getProperties();
        for (String propertyName : properties) {
            ColumnMetadata columnMetadata = entityMetadata.getColumnNotNull(propertyName);
            Property<Object, ?> propertyGetter = EasyUtil.getPropertyLambdaGetter(entityClass, propertyName, columnMetadata.getProperty().getPropertyType());

            Object originalPropertyValue = propertyGetter.apply(entityState.getOriginalValue());
            Object currentPropertyValue = propertyGetter.apply(entityState.getCurrentValue());
            if (
                    (originalPropertyValue == null && currentPropertyValue != null)
                            ||
                            !Objects.equals(originalPropertyValue, currentPropertyValue)
            ) {
                if (entityMetadata.isKeyProperty(propertyName)) {
                    throw new EasyQueryException(ClassUtil.getSimpleName(entityClass) + ": track entity cant modify primary key:[" + originalPropertyValue + "," + currentPropertyValue + "]");
                }
                diffProperties.put(propertyName,new TrackDiffEntry(originalPropertyValue,currentPropertyValue));
            }
        }
        return diffProperties;
    }
}
