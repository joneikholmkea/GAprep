package jon.gaprep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;

@SpringBootApplication
public class GAprepApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(GAprepApplication.class, args);
        }catch (Exception e){
            System.out.println("bad start ..."  + e.getMessage());
        }
    }

}
