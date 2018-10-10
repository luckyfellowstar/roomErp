package com.yc.room.service.roomErp.comm.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 数据源配置
 */
@Configuration
public class DataSources {


    //主数据源配置
    @Primary
    @Bean(name = "baseDataSource")
    @Qualifier("baseDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.mysql.jpa")
    public DataSource primaryDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }


    //第二数据源配置
    @Bean(name = "mybatisDataSource")
    @Qualifier("mybatisDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.mysql.mybatis")
    public DataSource trackDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
