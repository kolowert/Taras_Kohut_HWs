package com.epam.spring.homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.epam.spring.homework2.config.App2Config;

public class App2 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App2Config.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();

		System.out.printf("\nList of all components created in ApplicationContext:");

		int counter = 0;
		for (String beanDefinitionName : beanDefinitionNames) {
			++counter;
			Object bean = context.getBean(beanDefinitionName);
			System.out.printf("%d) %s >> %s%n", counter, beanDefinitionName, bean);
		}

		System.out.printf("End of List of all components created in ApplicationContext:\n\n");

		context.close();
		System.out.printf("Counted %d beans", counter);
	}
}
