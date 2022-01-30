package com.epam.spring.homework2.bcd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import com.epam.spring.homework2.abstraction.CustomComponent;
import com.epam.spring.homework2.abstraction.ShouldValid;

@CustomComponent
@ShouldValid
@PropertySource("classpath:bcd.properties")
public class BeanD {
	@Value("${beanD.name}")
	private String name;
	@Value("${beanD.value}")
	private int value;
	
	public void init() {
		System.out.println("init # BeanD");
	}
	
	public void destroy() {
		System.out.println("destroy # BeanD");
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}
	
}
