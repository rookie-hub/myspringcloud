package com.cloud.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    // 默认的自动配置是判断容器中没有才会配@ConditionalOnMissingBean(DataSource.class)
    @Bean
    @ConfigurationProperties("spring.datasource")//将DruidDataSource中的属性与配置文件中spring.datasource下的参数进行绑定
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}
