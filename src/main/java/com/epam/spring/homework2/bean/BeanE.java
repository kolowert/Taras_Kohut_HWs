package com.epam.spring.homework2.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.epam.spring.homework2.abstraction.CustomComponent;
import com.epam.spring.homework2.abstraction.Validated;

@CustomComponent
@Validated
public class BeanE {
	private String name;
	private int value;

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
