//Flipkart.java
package com.nit.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class FlipKart {
	   // HAS- A property
	@Autowired
	@Qualifier("dtdc")
	private Courier courier;
	
	public FlipKart() {
		System.out.println("Flipkart:: 0-param consturctor");
	}
	
	
	
	//b.method
	public  String  shopping(String items[], float prices[]) {
		System.out.println("Flipkart.shopping(-,-)");
		//calculate bill amount
		float billAmt=0.0f;
		for(float p: prices) {
			billAmt=billAmt+p;
		}
		//generate order id
		 int oid=new Random().nextInt(10000);
		//use  courirer for delivery
		  String msg=courier.deliver(oid);
		 return  Arrays.toString(items)+" are ordered with prices "+Arrays.toString(prices)+" having bill Amount::"+billAmt+" -----"+msg;
	}

}
