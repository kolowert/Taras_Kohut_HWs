package com.epam.spring.homework2.bean;

import org.springframework.beans.factory.annotation.Value;

import com.epam.spring.homework2.abstraction.CustomComponent;
import com.epam.spring.homework2.abstraction.ShouldValid;

@CustomComponent
@ShouldValid
public class BeanF {
	
	@Value("Funy Felicia")
	private String name;
	@Value("100500")
	private long value;
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -> fields: name=" + name + ", value=" + value;
	}
	
}
