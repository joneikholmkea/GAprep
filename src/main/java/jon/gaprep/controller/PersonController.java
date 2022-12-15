package jon.gaprep.controller;

import jon.gaprep.model.Person;
import jon.gaprep.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
        //personService.save(new Person("ole"));
    }

    @GetMapping("/persons")
    public ResponseEntity<Set<Person>> getPersons(){
        return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addPerson")
    public ResponseEntity<Set<Person>> addPerson(Person person){
        personService.save(person);
        return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
    }
}
