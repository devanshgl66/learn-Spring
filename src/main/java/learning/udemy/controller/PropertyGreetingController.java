package learning.udemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import learning.udemy.service.GreetingService;
@Controller
public class PropertyGreetingController implements GreetingController{

    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;
    @Override
    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
