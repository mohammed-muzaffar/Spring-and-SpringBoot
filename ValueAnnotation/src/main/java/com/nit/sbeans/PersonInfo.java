package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("pInfo")
public class PersonInfo {
	@Value("${person.name}")
	private String name;
	@Value("${person.address}")
	private String address;
	@Value("${person.age}")
	private int age;
	@Value("${os.name}")
	private String osName;
	@Value("${os.version}")
	private float version;
	@Value("${path}")
	private String pathDate;
	
	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", address=" + address + ", age=" + age + ", osName=" + osName
				+ ", version=" + version + ", pathDate=" + pathDate + "]";
	}
	
	
}
