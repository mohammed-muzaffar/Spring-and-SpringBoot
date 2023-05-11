package ai.neuron.dao;

import org.springframework.stereotype.Repository;

@Repository
//this annotation used for dao class
public class UserDao {

	public UserDao() {
		System.out.println("UserDao Obj Created");
	}
	
	public boolean sava() {
		System.out.println("Data is save in db");
		return  true;
	}
}
