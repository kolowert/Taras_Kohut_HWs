package com.epam.spring.homework1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.epam.spring.homework1.config.BeansConfig;
import com.epam.spring.homework1.pet.Pet;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Pet pet = context.getBean(Pet.class);
		pet.printPets();
		context.close();
	}
}
