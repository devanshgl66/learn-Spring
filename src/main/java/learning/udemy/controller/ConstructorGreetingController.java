package learning.udemy.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import learning.udemy.service.GreetingService;

@Controller
public class ConstructorGreetingController {
	GreetingService greetingService;

	public ConstructorGreetingController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
}
