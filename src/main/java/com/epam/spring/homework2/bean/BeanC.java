package com.epam.spring.homework2.bean;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
	private String name;
	private long value;
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}
	
}
