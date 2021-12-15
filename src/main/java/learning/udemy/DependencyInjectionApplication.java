package learning.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learning.udemy.controller.GreetingController;

@SpringBootApplication
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

	}
}
