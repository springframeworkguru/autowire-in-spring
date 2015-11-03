package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by jt on 11/3/15.
 */
@Controller
public class HelloController {

    public String sayHello(){
        return "Hello World!";
    }
}
