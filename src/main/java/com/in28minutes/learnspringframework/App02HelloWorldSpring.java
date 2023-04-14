package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1.Launch a spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2.configure the things that we want spring to manage - @Configuration
		//HelloWorldConfiguration -@Configuration
		//name -@Bean
		
		//3.Retrieves beans managed by spring  
		System.out.println(context.getBean("name"));
		
		//calling age
		System.out.println(context.getBean("age"));
		
		//calling by name of the bean
		System.out.println(context.getBean("person"));
		
		
		//calling by attribute
		System.out.println(context.getBean("address2"));
		
		//calling type of the bean
		System.out.println(context.getBean(Address.class));
		
		//calling the parameter in the form of method
		System.out.println(context.getBean("person2"));
		
		//calling the bean which have relation b/w two record
		System.out.println(context.getBean("detail"));
	}

}
