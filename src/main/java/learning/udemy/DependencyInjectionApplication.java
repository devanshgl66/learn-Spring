package learning.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learning.udemy.service.ConstructorGreetingService;
import learning.udemy.service.GreetingService;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(DependencyInjectionApplication.class, args);
		ConstructorGreetingService constructorGreetingService = (ConstructorGreetingService) cxt
				.getBean("constructorGreetingService");
		System.out.println("-----------------Constructor");
		System.out.println(constructorGreetingService.sayGreetings());
	}
}
