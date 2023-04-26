package com.nit.Value;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nit.sbeans.PersonInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
    	
    	PersonInfo info = context.getBean("pInfo", PersonInfo.class);
    	
    	System.out.println(info);
    	
        PersonInfo pi = context.getBean("pi", PersonInfo.class);
    	System.out.println(info);
    	
    	PersonInfo p = context.getBean("p", PersonInfo.class);
    	System.out.println(p);
    	
    	
		
System.out.println("_____________________________________");
		
		Environment  env=context.getEnvironment();
		System.out.println("os.name ::"+env.getRequiredProperty("os.name"));
		System.out.println("Path data ::"+env.getRequiredProperty("Path"));
		
		//close Container
		context.close();
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("The System properties are ::"+System.getProperties());

    }
}
