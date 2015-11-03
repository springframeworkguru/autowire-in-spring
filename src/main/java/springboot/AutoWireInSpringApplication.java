package springboot;

import guru.springframework.controllers.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"guru.springframework.controllers", "guru.springframework.services"})
public class AutoWireInSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AutoWireInSpringApplication.class, args);

        HelloController controller = ctx.getBean(HelloController.class);

        System.out.println(controller.sayHello());
    }
}
