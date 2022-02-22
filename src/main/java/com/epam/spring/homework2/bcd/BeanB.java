package com.epam.spring.homework2.bcd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import com.epam.spring.homework2.abstraction.Validated;

//@CustomComponent
@Validated
@PropertySource("bcd.properties")
public class BeanB {
	@Value("${beanB.name}")
	private String name;
	@Value("${beanB.value}")
	private int value;

	public void init() {
		System.out.println("init # BeanB");
	}

	public void init2() {
		System.out.println("init2 # BeanB");
	}

	public void destroy() {
		System.out.println("doDestroy # BeanB");
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}

}
