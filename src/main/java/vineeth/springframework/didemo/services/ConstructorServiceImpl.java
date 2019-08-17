package vineeth.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorServiceImpl implements GrettingService {
    @Override
    public String sayGretting() {
        return "Constructor Gretting Service is called ";
    }
}
