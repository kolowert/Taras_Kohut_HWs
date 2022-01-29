package com.epam.spring.homework2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.epam.spring.homework2.beanito.BeanE;
import com.epam.spring.homework2.beanito.BeanF;

@Configuration
public class App2Config2 {
	
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
