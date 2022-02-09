package com.epam.spring.homework2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import com.epam.spring.homework2.bean.BeanA;
import com.epam.spring.homework2.bean.BeanE;
import com.epam.spring.homework2.bean.BeanF;

@Configuration
@PropertySource("classpath:bcd.properties")
@ComponentScan(basePackages = "com.epam.spring.homework2.config")
@Import(App2ConfigBcd.class)
public class App2Config {

	@Bean
	@Order(Ordered.LOWEST_PRECEDENCE)
	public BeanA beanA() {
		return new BeanA("Happy Alisa", 544715);
	}

	@Bean
	public BeanE beanE() {
		return new BeanE();
	}

	@Bean
	@Lazy
	public BeanF beanF() {
		return new BeanF();
	}

}
