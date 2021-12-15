package learning.udemy.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

	@Override
	public String sayGreetings() {
		return "Hello World - Property";
	}

}
