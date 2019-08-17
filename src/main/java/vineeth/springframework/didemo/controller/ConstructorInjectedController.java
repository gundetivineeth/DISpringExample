package vineeth.springframework.didemo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vineeth.springframework.didemo.services.GrettingService;

@Controller
public class ConstructorInjectedController {

    private GrettingService grettingService;

   public ConstructorInjectedController(@Qualifier("constructorServiceImpl") GrettingService grettingService)
    {
        this.grettingService = grettingService;
    }

    public String sayHello()
    {
        return grettingService.sayGretting();
    }
}
