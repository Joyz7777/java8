package com.jo;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;

import javax.sql.DataSource;
import java.sql.Driver;

@Configuration
@EnableJdbcRepositories
@PropertySource("classpath:jdbc.properties")
@ComponentScan(basePackages= "com.jo")
public class ApplicationConfig extends AbstractJdbcConfiguration {



    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;



    @Bean("dataSource")
    DataSource dataSource(){


        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(username);
        druidDataSource.setUrl(url);
        druidDataSource.setPassword(password);
        druidDataSource.setDriverClassName(driverClassName);

        return druidDataSource;


    }

    //设置JDBC连接
    @Bean
    NamedParameterJdbcOperations namedParameterJdbcOperations(DataSource dataSource){
       return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    TransactionManager transactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

}
