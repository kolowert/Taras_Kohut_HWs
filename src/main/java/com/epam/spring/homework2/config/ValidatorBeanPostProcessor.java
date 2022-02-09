package com.epam.spring.homework2.config;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.epam.spring.homework2.abstraction.CustomComponent;
import com.epam.spring.homework2.abstraction.ShouldValid;

@Component
public class ValidatorBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + " ~ postProcessAfterInitialization # ValidatorBeanPostProcessor");
		if (bean.getClass().isAnnotationPresent(CustomComponent.class)
				&& bean.getClass().isAnnotationPresent(ShouldValid.class)) {
			try {
				Field field = bean.getClass().getDeclaredField("name");
				field.setAccessible(true);
				Object value = field.get(bean);
				if (value == null) {
					invalidBeanException(beanName, "Field 'name' shouldn't be null!");
				}
				Field field2 = bean.getClass().getDeclaredField("value");
				field2.setAccessible(true);
				Object value2 = field2.get(bean);
				if (value2 == null || Integer.valueOf(value2.toString()) < 0) {
					invalidBeanException(beanName, "Field 'value' shouldn't be lower than 0!");
				}
			} catch (Exception e) {
				System.out.println("caught Exception @ " + beanName);
				e.printStackTrace();
			}
		}
		return bean;
	}

	private void invalidBeanException(String beanName, String message) {
		throw new RuntimeException("Invalid bean: " + beanName + "! " + message);
	}

}
