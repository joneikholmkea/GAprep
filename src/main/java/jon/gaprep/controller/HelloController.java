package jon.gaprep.controller;

import jon.gaprep.model.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Date;


@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<Greeting> getHello(){
        System.out.println("greeting controller Java message");
        Greeting g = new Greeting("hi from server at Azure", new Date());
        return new ResponseEntity<>(g, HttpStatus.OK);
        // Jackson (from Spring Boot Web) is used to convert object to JSON
    }


}
