package vineeth.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GrettingServiceImpl implements GrettingService {

    @Override
    public String sayGretting() {
        return "Gretting is called";
    }
}
