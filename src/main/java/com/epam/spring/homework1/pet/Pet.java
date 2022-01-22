package com.epam.spring.homework1.pet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.spring.homework1.abstraction.Animal;

@Component
public class Pet {

	@Autowired
	private List<Animal> animals;

	public void printPets() {
		for (Animal animal : animals) {
			System.out.println(animal.getClass().getSimpleName());
		}
	}
}
