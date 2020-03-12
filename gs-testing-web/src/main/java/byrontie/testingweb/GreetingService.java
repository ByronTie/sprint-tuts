package byrontie.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "To infinity and beyond";
    }
}