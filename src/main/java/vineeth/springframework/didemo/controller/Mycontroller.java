package vineeth.springframework.didemo.controller;

import org.springframework.stereotype.Controller;
import vineeth.springframework.didemo.services.GrettingService;

@Controller
public class Mycontroller {

    private GrettingService grettingService;

    public Mycontroller(GrettingService grettingService)
    {
        this.grettingService = grettingService;
    }

    public String hello()
    {
        System.out.println("Hello world");
        return grettingService.sayGretting();
    }

}
