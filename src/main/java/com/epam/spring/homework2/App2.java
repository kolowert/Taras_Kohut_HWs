package com.epam.spring.homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.epam.spring.homework2.bean.BeanA;
import com.epam.spring.homework2.config.App2Config;

public class App2 {
	public static void main(String[] args) {
		BeanA beanA = new BeanA();
		System.out.println(beanA);
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App2Config.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
		
		context.close();
	}
}
