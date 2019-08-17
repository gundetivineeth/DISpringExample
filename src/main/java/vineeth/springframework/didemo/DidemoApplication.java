package vineeth.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vineeth.springframework.didemo.controller.ConstructorInjectedController;
import vineeth.springframework.didemo.controller.Mycontroller;
import vineeth.springframework.didemo.controller.PropertyInjectedController;
import vineeth.springframework.didemo.controller.SetterInjectedController;

@SpringBootApplication
public class DidemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx= SpringApplication.run(DidemoApplication.class, args);

        Mycontroller mc = (Mycontroller)ctx.getBean("mycontroller");

        System.out.println(mc.hello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());


    }

}
