package learning.udemy.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import learning.udemy.sfgdi.service.GreetingService;

@Controller
public class ConstructorGreetingController implements GreetingController{
	GreetingService greetingService;

	public ConstructorGreetingController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	@Override
    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
