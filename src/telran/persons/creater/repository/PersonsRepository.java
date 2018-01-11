package telran.persons.creater.repository;

import org.springframework.data.repository.CrudRepository;

import telran.persons.creater.entities.Person;

public interface PersonsRepository extends CrudRepository<Person, Integer> {

}
