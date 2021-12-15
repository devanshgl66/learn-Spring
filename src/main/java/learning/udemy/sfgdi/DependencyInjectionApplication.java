package learning.udemy.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import learning.udemy.sfgdi.controller.GreetingController;
import learning.udemy.sfgdi.controller.PetController;

@SpringBootApplication
@ComponentScan(basePackages = {"learning.udemy.sfgdi","learning.udemy.pets"})
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(DependencyInjectionApplication.class, args);
		GreetingController constructorGreetingController = (GreetingController) cxt
				.getBean("constructorGreetingController");
		System.out.println("-----------------Constructor");
		System.out.println(constructorGreetingController.getGreeting());
		GreetingController propertyGreetingController = (GreetingController) cxt
				.getBean("propertyGreetingController");
		System.out.println("-----------------Property");
		System.out.println(propertyGreetingController.getGreeting());
		GreetingController setterGreetingController = (GreetingController) cxt
				.getBean("setterGreetingController");
		System.out.println("-----------------Setter");
		System.out.println(setterGreetingController.getGreeting());
		
		GreetingController i18nlangGreetingController = (GreetingController) cxt
				.getBean("i18nLangGreetingController");
		System.out.println("-----------------Setter");
		System.out.println(i18nlangGreetingController.getGreeting());

		PetController petController = (PetController)cxt.getBean("petController");
		System.out.println(petController.whichPetIsBest());
	}
}
