package jon.gaprep.repository;

import jon.gaprep.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {
}

