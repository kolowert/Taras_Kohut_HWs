package com.epam.spring.homework2.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE {
	private String name;
	private long value;
	
	@PostConstruct
	private void postConstruct() {
		name = "Pretty Elvira";
		value = 100500;
		System.out.println("postConstruct # BeanE");
	}
	
	@PreDestroy
	private void preDestroy() {
		System.out.println("preDestroy # BeanE");
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}
	
}
