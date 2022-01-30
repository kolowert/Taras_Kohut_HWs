package com.epam.spring.homework2.bcd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
@PropertySource("bcd.properties")
public class BeanC {
	@Value("${beanC.name}")
	private String name;
	@Value("${beanC.value}")
	private int value;
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}
	
}
