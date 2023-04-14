package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//record is a new feature introduced in JDK 16. If you are using record then you don't have to create setter and getter methods all are created automatically for us.
record Person (String name, int age) {};

record Address (String firstLine, String city) {};

record Detail (Person person, Address address) { };

	

@Configuration
public class HelloWorldConfiguration {
	@Bean 
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean 
	public Person person() {
		var person = new Person(name(), age());
		return person;
	}
	
	@Bean("address2")
	public Address address() {
		var address = new Address("W Devon", "Devon");
		return address;
	}
	
	@Bean
	public Person person2 () {
		var person = new Person(name(), age());
		return person;
	}
	
	@Bean
	public Detail detail() {
		var detail = new Detail(person(), address());
		return detail;
	}
	
	@Bean
	public Detail personwithParameters(Person person, Address address2) {
		return new Detail(person, address2);
	}
}

