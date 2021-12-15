package learning.udemy.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import learning.udemy.service.GreetingService;
@Controller
public class I18nLangGreetingController implements GreetingController{
	GreetingService greetingService;

	public I18nLangGreetingController(@Qualifier("i18nLangService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return greetingService.sayGreetings();
	}
}
