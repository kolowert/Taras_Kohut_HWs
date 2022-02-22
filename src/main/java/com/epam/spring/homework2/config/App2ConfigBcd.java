package com.epam.spring.homework2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import com.epam.spring.homework2.bcd.BeanB;
import com.epam.spring.homework2.bcd.BeanC;
import com.epam.spring.homework2.bcd.BeanD;

@Configuration
public class App2ConfigBcd {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@DependsOn("beanD")
	public BeanB beanB() {
		return new BeanB();
	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@DependsOn(value = { "beanD", "beanB" })
	public BeanC beanC() {
		return new BeanC();
	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Order(Ordered.HIGHEST_PRECEDENCE)
	public BeanD beanD() {
		return new BeanD();
	}
}
