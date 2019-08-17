package vineeth.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishServiceImpl implements GrettingService {
    @Override
    public String sayGretting() {
        return "eldlf skdk akdkdkd";
    }
}
