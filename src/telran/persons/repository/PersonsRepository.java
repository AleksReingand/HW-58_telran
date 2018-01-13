package telran.persons.repository;

import org.springframework.data.repository.CrudRepository;

import telran.persons.entities.Person;

public interface PersonsRepository extends CrudRepository<Person, Integer> {

}
