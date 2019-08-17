package vineeth.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterServiceImpl implements GrettingService {
    @Override
    public String sayGretting() {
        return "Setter Gretting Service is called";
    }
}
