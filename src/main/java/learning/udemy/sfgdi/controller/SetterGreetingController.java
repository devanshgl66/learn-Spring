package learning.udemy.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import learning.udemy.sfgdi.service.GreetingService;
@Controller
public class SetterGreetingController implements GreetingController{

    private GreetingService greetingService;

    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    @Override
    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
