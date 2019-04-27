package com.example.waterfall_memory.config.dao;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

@Configuration
public class SessionFactoryConfiguration {
	private static String mybatisConfigFile = "mybatis-config.xml";
	private static String mapperPath = "/mapper/**.xml";
	private static String typeAliasesPackage = "com.example.dto";
	@Autowired
	private DataSource ds;
	
	@Bean(name = "ssf")
	public SqlSessionFactoryBean createSSF() throws IOException {
		SqlSessionFactoryBean ssf = new SqlSessionFactoryBean();
		ssf.setConfigLocation(new ClassPathResource(mybatisConfigFile));
		
		PathMatchingResourcePatternResolver pmrpr = new PathMatchingResourcePatternResolver();
		String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX +mapperPath;
		ssf.setMapperLocations(pmrpr.getResources(packageSearchPath));
		ssf.setDataSource(ds);
		//实体类的包
		ssf.setTypeAliasesPackage(typeAliasesPackage);

		return ssf;

	}



	public void setMybatisConfigFile(String mybatisConfigFile) {
		SessionFactoryConfiguration.mybatisConfigFile = mybatisConfigFile;
	}


	public void setMapperPath(String mapperPath) {
		SessionFactoryConfiguration.mapperPath = mapperPath;
	}

}
