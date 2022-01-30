package com.epam.spring.homework2.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Qualifier("justA")
@Order(4)
public class BeanA {
	private String name;
	private int value;
	
	public BeanA(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}
	
}
