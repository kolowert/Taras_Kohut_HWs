package com.epam.spring.homework2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.epam.spring.homework2.bcd.BeanB;
import com.epam.spring.homework2.bcd.BeanC;
import com.epam.spring.homework2.bcd.BeanD;

@Configuration
public class App2ConfigBcd {
	
	@Bean(initMethod="init",destroyMethod="destroy")
	@Order(2)
	public BeanB beanB() {
		return new BeanB();
	}
	
	@Bean(initMethod="init",destroyMethod="destroy")
	@Order(3)
	public BeanC beanC() {
		return new BeanC();
	}
	
	@Bean(initMethod="init",destroyMethod="destroy")
	@Order(1)
	public BeanD beanD() {
		return new BeanD();
	}
}
