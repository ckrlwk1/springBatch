package com.example.springbatch.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(destroyMethod="")
    @ConfigurationProperties(prefix="spring.db1.datasource")
    public DataSource dataSource() throws Exception {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }
}
