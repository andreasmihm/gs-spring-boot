package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(@RequestParam(value = "key", required = false) String key) {
        return "Diva Spring Boot Sample Greetings on Azure for key " + key;
    }

}
