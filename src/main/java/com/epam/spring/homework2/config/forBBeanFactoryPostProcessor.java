package com.epam.spring.homework2.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class forBBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("inside postProcessBeanFactory # forBBeanFactoryPostProcessor");
		BeanDefinition bd = beanFactory.getBeanDefinition("beanB");
		bd.setInitMethodName("init2");
	}

}
