package com.springboot.zzd.djh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * @author: zhendong.Z
 * @date: 2019-11-22 15:51
 */
public class DataSourceProperties {
    @Bean
    @Primary
    @ConfigurationProperties("djh.mybatis.datasource")
    public DataSourceProperties firstDataSourceProperties() {
        return new DataSourceProperties();
    }
}
