package com.easy.query.core.expression.sql;

import com.easy.query.core.exception.EasyQueryInvalidOperationException;
import com.easy.query.core.expression.parser.core.available.TableAvailable;
import com.easy.query.core.util.EasyClassUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * create time 2023/5/27 08:08
 * 文件说明
 *
 * @author xuejiaming
 */
public final class TableContext {
    private final LinkedHashMap<TableAvailable, TableAliasSchema> aliasMapping = new LinkedHashMap<>();

    public void extract(TableContext otherTableContext) {
        for (Map.Entry<TableAvailable, TableAliasSchema> aliasSchemaEntry : otherTableContext.aliasMapping.entrySet()) {
            addTable(aliasSchemaEntry.getKey());
        }
    }

    public void addTable(TableAvailable table) {
        int size = aliasMapping.size();
        aliasMapping.put(table, new TableAliasSchema(table, size));
    }

    public String getTableAlias(TableAvailable table, String alias) {
        if (table == null) {
            throw new IllegalArgumentException("table is null");
        }
        int mappingSize = aliasMapping.size();
        if (mappingSize == 0) {
            return null;
        }
        if (mappingSize == 1) {
            TableAliasSchema tableAliasSchema = getTableAliasSchema(table);
            if (tableAliasSchema.getTable().isAnonymous()||tableAliasSchema.getTable().hasAlias()) {
                return tableAliasSchema.getTableAlias(alias);
            }
            return null;
        }
        return getTableAliasSchema(table).getTableAlias(alias);
    }

    public boolean isEmpty() {
        return aliasMapping.isEmpty();
    }

    public TableAliasSchema getTableAliasSchema(TableAvailable table) {

        TableAliasSchema tableAliasSchema = aliasMapping.get(table);
        if (tableAliasSchema == null) {
            throw new EasyQueryInvalidOperationException("unknown table:" + EasyClassUtil.getSimpleName(table.getEntityClass()) + "." + table.getTableName());
        }
        return tableAliasSchema;
    }

    public void copyTo(TableContext tableContext){
        for (Map.Entry<TableAvailable, TableAliasSchema> aliasSchemaEntry : aliasMapping.entrySet()) {
            tableContext.addTable(aliasSchemaEntry.getKey());
        }
    }

    public ToTableContext getToTableContext(String alias){
        int mappingSize = aliasMapping.size();
        HashMap<TableAvailable, String> result = new HashMap<>();
        int i=0;
        boolean firstHasAlias=false;
        for (Map.Entry<TableAvailable, TableAliasSchema> aliasSchemaEntry : aliasMapping.entrySet()) {

            TableAvailable table = aliasSchemaEntry.getKey();
            TableAliasSchema tableAliasSchema = aliasSchemaEntry.getValue();
            String tableAlias = tableAliasSchema.getTableAlias(alias);
            if (i == 0) {
                if (tableAliasSchema.getTable().isAnonymous()||tableAliasSchema.getTable().hasAlias()) {
                    firstHasAlias=true;
                }
            }
            result.put(table,tableAlias);
            i++;
        }
        return new ToTableContext(result,mappingSize,firstHasAlias);
    }
}
