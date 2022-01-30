package com.epam.spring.homework2.bcd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:bcd.properties")
public class BeanD {
	@Value("${beanD.name}")
	private String name;
	@Value("${beanD.value}")
	private int value;
	
	public void init() {
		System.out.println("doInit # BeanD");
	}
	
	public void destroy() {
		System.out.println("doDestroy # BeanD");
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}
	
}
