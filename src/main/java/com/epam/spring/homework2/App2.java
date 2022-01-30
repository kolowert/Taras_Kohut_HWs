package com.epam.spring.homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.epam.spring.homework2.config.App2Config;

public class App2 {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App2Config.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			Object bean = context.getBean(beanDefinitionName);
			String beanInfo = bean.toString();
			if (beanInfo.contains("name")) {
				System.out.println(beanDefinitionName + " >> " + bean.toString());
			}
		}

		context.close();
	}
}
