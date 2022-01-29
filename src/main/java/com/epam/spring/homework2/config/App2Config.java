package com.epam.spring.homework2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:bcd.properties") // this not work TODO
@ComponentScan(basePackages = "com.epam.spring.homework2.bean")
@Import(App2Config2.class)
@ImportResource("classpath:bean.xml")
public class App2Config {
	
}
