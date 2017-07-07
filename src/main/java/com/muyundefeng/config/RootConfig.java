package com.muyundefeng.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.ResourcePatternUtils;

/**
 * Mybatis配置(除了spring mvc以外的配置)
 * Created by lisheng on 17-7-7.
 */
@Configuration
public class RootConfig {
    @Bean
    public BasicDataSource basicDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/auto_spider");
        basicDataSource.setPassword("root");
        basicDataSource.setUsername("root");
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return basicDataSource;
    }

    //配置mybatis sqlsessionFactoryBean
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean factoryBean() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(basicDataSource());
        return sqlSessionFactoryBean;
    }

    //配置扫描sql映射文件
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.muyundefeng.mapper");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }
}
