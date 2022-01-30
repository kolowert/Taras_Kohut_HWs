package com.epam.spring.homework2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.epam.spring.homework2.bean.BeanA;

@Configuration
@PropertySource("classpath:bcd.properties")
@ComponentScan(basePackages = "com.epam.spring.homework2.bcd")
@Import(App2Config2.class)
@ImportResource("classpath:bean.xml")
public class App2Config {
	
	@Bean
	public BeanA beanA() {
		return new BeanA("Happy Alisa", 544715);
	}
}
