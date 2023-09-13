package dio.aula.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControler {
    @GetMapping
    public String welcome(){
        return "Welcome to my spring boot web API";
    }
}
