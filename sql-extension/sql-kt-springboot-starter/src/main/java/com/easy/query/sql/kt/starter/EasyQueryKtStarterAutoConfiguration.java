package com.easy.query.sql.kt.starter;

import com.easy.query.api4kt.client.DefaultEasyKtQuery;
import com.easy.query.api4kt.client.EasyKtQuery;
import com.easy.query.core.api.client.EasyQueryClient;
import com.easy.query.sql.starter.EasyQueryStarterAutoConfiguration;
import com.easy.query.sql.starter.config.EasyQueryProperties;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author xuejiaming
 * @FileName: EasyQueryStarter.java
 * @Description: 文件说明
 * @Date: 2023/3/11 12:47
 */
@Configuration
@EnableConfigurationProperties(EasyQueryProperties.class)
@ConditionalOnBean(DataSource.class)
@AutoConfigureAfter({EasyQueryStarterAutoConfiguration.class})
@ConditionalOnProperty(
        prefix = "easy-query",
        value = {"enable"},
        matchIfMissing = true
)
public class EasyQueryKtStarterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public EasyKtQuery easyKtQuery(EasyQueryClient easyQueryClient) {
        return new DefaultEasyKtQuery(easyQueryClient);
    }

}
