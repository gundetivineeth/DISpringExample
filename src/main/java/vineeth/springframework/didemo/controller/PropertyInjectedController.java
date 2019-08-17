package vineeth.springframework.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vineeth.springframework.didemo.services.GrettingService;
import vineeth.springframework.didemo.services.GrettingServiceImpl;

@Controller
public class PropertyInjectedController {

    @Autowired
    private GrettingServiceImpl grettingService;


    public String sayHello()
    {
        return grettingService.sayGretting();
    }
}
