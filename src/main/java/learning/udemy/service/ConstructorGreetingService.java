package learning.udemy.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

	@Override
	public String sayGreetings() {
		return "Hello World - Constructor";
	}
	
}
