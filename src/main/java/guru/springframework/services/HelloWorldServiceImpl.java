package guru.springframework.services;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 11/3/15.
 */
@Component
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello() {
        return "Hello World!!!";
    }
}
