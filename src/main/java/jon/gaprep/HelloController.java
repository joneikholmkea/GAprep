package jon.gaprep;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<Greeting> getHello(){
        Greeting g = new Greeting("hi from server", new Date());
        return new ResponseEntity<>(g, HttpStatus.OK);
        // Jackson (from Spring Boot Web) is used to convert object to JSON
    }
}
