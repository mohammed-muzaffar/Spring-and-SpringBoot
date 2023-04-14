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
	}

}
