package com.epam.spring.homework2.bcd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("bcd.properties")
public class BeanC {
	@Value("${beanC.name}")
	private String name;
	@Value("${beanC.value}")
	private int value;
	
	public void init() {
		System.out.println("doInit # BeanC");
	}
	
	public void destroy() {
		System.out.println("doDestroy # BeanC");
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}
	
}
