package org.easy.query.core.executor.type;

import java.sql.ResultSet;

/**
 * @FileName: EasyResultSet.java
 * @Description: 文件说明
 * @Date: 2023/2/17 13:11
 * @Created by xuejiaming
 */
public class EasyResultSet {
    private int index;
    private  Class propertyType;
    private final ResultSet rs;

    public EasyResultSet(ResultSet rs){

        this.rs = rs;
    }

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public Class getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(Class propertyType) {
        this.propertyType = propertyType;
    }

    public ResultSet getRs() {
        return rs;
    }

    public boolean isPrimitive() {
        return propertyType != null && propertyType.isPrimitive();
    }
}
