package com.baizhi.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = JDBCProp.class)
public class JavaConf {

    @Autowired
    JDBCProp jdbcProp;

    @Bean
    public DruidDataSource getDruidDataSource(){

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(jdbcProp.getDriverClassName());
        druidDataSource.setUrl(jdbcProp.getUrl());
        druidDataSource.setUsername(jdbcProp.getUsername());
        druidDataSource.setPassword(jdbcProp.getPassword());
        return druidDataSource;
    }
}
