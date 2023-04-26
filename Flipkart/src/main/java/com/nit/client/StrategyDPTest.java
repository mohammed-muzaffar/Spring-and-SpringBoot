//StrategyDPTest.java (Client App)
package com.nit.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.FlipKart;

public class StrategyDPTest {

	public static void main(String[] args) {
		//create  IOC container
		 ClassPathXmlApplicationContext  ctx=
				  new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		 // get Target spring bean class obj ref
		 FlipKart fpkt=ctx.getBean("fpkt",FlipKart.class);
		 //invoke the b.methods
		 String result=fpkt.shopping(new String[] {"shirt","trouser"},
				                                         new float[] {4000.0f,3000.0f});
		 System.out.println(result);
		 //close the IOC container
		 ctx.close();
		 
//		 System.out.println(System.getProperties());

	}

}
