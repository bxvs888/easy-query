package com.easy.query.processor.templates;

/**
 * create time 2023/11/8 17:08
 * 文件说明
 *
 * @author xuejiaming
 */
public class AptConstant {

    public static final String PROXY_TEMPLATE = "package @{package};\n" +
            "\n" +
            "import com.easy.query.core.expression.parser.core.available.TableAvailable;\n" +
            "import com.easy.query.core.proxy.AbstractProxyEntity;\n" +
            "import com.easy.query.core.proxy.SQLColumn;\n" +
            "@{imports}" +
            "\n" +
            "/**\n" +
            " * this file automatically generated by easy-query, don't modify it\n" +
            " *\n" +
            " * @author xuejiaming\n" +
            " */\n" +
            "public class @{entityClass}Proxy extends AbstractProxyEntity<@{entityClass}Proxy, @{entityClass}> {\n" +
            "\n" +
            "    private static final Class<@{entityClass}> entityClass = @{entityClass}.class;\n" +
            "    public static @{entityClass}Proxy createTable() {\n" +
            "        return new @{entityClass}Proxy();\n" +
            "    }\n" +
            "\n" +
            "    private @{entityClass}Proxy() {\n" +
            "    }\n" +
            "\n" +
            "    @{fieldContent}" +
            "\n" +
            "    @Override\n" +
            "    public Class<@{entityClass}> getEntityClass() {\n" +
            "        return entityClass;\n" +
            "    }\n" +
            "\n" +
            "    @{valueObjectContext}\n" +
            "}";




    public static final String FIELD_TEMPLATE = "\n" +
            "    @{comment}\n" +
            "    public SQLColumn<@{entityClass}Proxy,@{propertyType}> @{property}(){\n" +
            "        return get(\"@{property}\");\n" +
            "    }";
    public static final String FIELD_VALUE_OBJECT_TEMPLATE = "\n" +
            "    @{comment}\n" +
            "    public @{entityClass}Proxy @{property}() {\n" +
            "        return getValueObject(new @{entityClass}Proxy(getTable(), getValueProperty(\"@{property}\")));\n" +
            "    }";


    public static final String FIELD_VALUE_OBJECT_CLASS_TEMPLATE = "\n" +
            "    public static class @{entityClass}Proxy extends AbstractValueObjectProxyEntity<@{mainEntityClass}Proxy, @{entityClass}> {\n" +
            "\n" +
            "        private @{entityClass}Proxy(TableAvailable table, String propertyName) {\n" +
            "            super(table, propertyName);\n" +
            "        }\n" +
            "\n" +
            "        @{fieldContent}" +
            "\n" +
            "        @{valueObjectContext}" +
            "    }";
}
