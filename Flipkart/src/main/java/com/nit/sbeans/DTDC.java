//DTDC.java
package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
//@Primary
public final class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC: 0-param constructor");
	}

	public String deliver(int oid) {
		return  oid +" order id  order  assigned to  DTDC for delivery"; 
	}

}
