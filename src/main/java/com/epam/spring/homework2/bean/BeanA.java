package com.epam.spring.homework2.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.epam.spring.homework2.abstraction.Validated;

//@CustomComponent
@Validated
public class BeanA implements InitializingBean, DisposableBean {
	private final String name;
	private final int value;

	public BeanA(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method after properties are set # " + this.getClass().getSimpleName());
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method ran # " + this.getClass().getSimpleName());
	}

}
