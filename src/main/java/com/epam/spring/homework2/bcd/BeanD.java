package com.epam.spring.homework2.bcd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@PropertySource("classpath:bcd.properties")
public class BeanD {
	@Value("${beanD.name}")
	private String name;
	@Value("${beanD.value}")
	private int value;
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}
	
}
