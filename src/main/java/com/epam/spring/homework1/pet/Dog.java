package com.epam.spring.homework1.pet;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.epam.spring.homework1.abstraction.Animal;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class Dog implements Animal {

}
