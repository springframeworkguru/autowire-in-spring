package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 11/3/15.
 */
@Controller
public class HelloController {

    HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello(){
        return helloWorldService.sayHello();
    }
}
