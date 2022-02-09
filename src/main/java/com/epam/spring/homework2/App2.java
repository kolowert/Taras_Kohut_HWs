package com.epam.spring.homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.epam.spring.homework2.abstraction.CustomComponent;
import com.epam.spring.homework2.config.App2Config;

public class App2 {
	public static void main(String[] args) {
		
		boolean doExpoSystemBeans = true;
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App2Config.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		
		System.out.println("\nList of all components created in ApplicationContext:");
		
		int counter = 0;
		for (String beanDefinitionName : beanDefinitionNames) {
			++counter;
			Object bean = context.getBean(beanDefinitionName);
			if (doExpoSystemBeans || bean.getClass().isAnnotationPresent(CustomComponent.class)) {
				System.out.printf("%d) %s >> %s%n", counter, beanDefinitionName, bean.toString());
			}
		}
		
		System.out.println("End of List of all components created in ApplicationContext:\n");

		context.close();
		System.out.println("Counted " + counter + " beans");
	}
}
