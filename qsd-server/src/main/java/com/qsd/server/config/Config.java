package com.qsd.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan("com.qsd")
@EnableWebMvc
public class Config {
	/**
	 * jsp视图解析器的bean
	 * 
	 * @return
	 */
	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Bean(name = "dataSource")
	public ComboPooledDataSource getDataSource() {
		try {
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			dataSource.setJdbcUrl("jdbc:mysql://101.200.158.166:3306/qsd");
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setUser("root");
			dataSource.setPassword("test");
			dataSource.setMaxPoolSize(75);
			return dataSource;
		} catch (Exception e) {
			return null;
		}
	}
}