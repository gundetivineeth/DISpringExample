package vineeth.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en","default"})
@Primary
public class PrimaryServiceImpl implements GrettingService {
    @Override
    public String sayGretting() {
        return "Primary Gretting Service";
    }
}
