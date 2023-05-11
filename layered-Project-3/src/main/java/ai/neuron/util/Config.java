package ai.neuron.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	public Config() {
		System.out.println("Config bean");
	}
	@Bean
	//this bean annotation will do management of the  custom obj life cycle which is present in method
	public EncPassword getInstance() {
		EncPassword pw = new EncPassword("SHA-01");
		return pw;
	}
	
}
