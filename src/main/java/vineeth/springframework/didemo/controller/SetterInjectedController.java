package vineeth.springframework.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vineeth.springframework.didemo.services.GrettingService;

@Controller
public class SetterInjectedController {

    private GrettingService grettingService;

    public String sayHello(){
        return grettingService.sayGretting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterServiceImpl") GrettingService grettingService) {
        this.grettingService = grettingService;
    }

}
