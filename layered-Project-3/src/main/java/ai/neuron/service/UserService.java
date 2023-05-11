package ai.neuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.neuron.dao.UserDao;

@Service
//this service annotation used for business class
public class UserService {
	
	@Autowired
	private UserDao userDao;
	

	public UserService() {
		System.out.println("User Service obj created");
	}
	
	public void storeInDb() {
		boolean status = userDao.sava();
		if(status) {
			System.out.println("Storing success");
		} else {
			System.out.println("Failed");
		}
	}
}
