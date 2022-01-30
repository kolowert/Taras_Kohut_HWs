package com.epam.spring.homework2.bean;

public class Legacy {

	private String name;
	private long value;
	
	public void doInit() {
		System.out.println("doInit # Legacy");
	}
	
	public void doDestroy() {
		System.out.println("doDestroy # Legacy");
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setValue(long value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}

}
