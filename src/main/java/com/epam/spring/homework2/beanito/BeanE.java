package com.epam.spring.homework2.beanito;

public class BeanE {
	private String name;
	private long value;
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}
	
}
