package com.example.waterfall_memory.config.dao;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.waterfall_memory.dao")//配置mybatis.mapper的扫描路径
public class DataSourceConfiguration {
	@Value("${jdbc.driver}")//通过@Value从application.properties中读标签，自定义的变量
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	
	/**
	 * 生成与spring-dao.xml对应的bean dataSource
	 */
	
	@Bean(name="dataSource")
	public BasicDataSource createDataSource(){
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
}
