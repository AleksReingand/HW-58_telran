package telran.persons.model;

import org.springframework.beans.factory.annotation.Autowired;

import telran.persons.entities.Person;
import telran.persons.interfaces.IPersons;
import telran.persons.repository.PersonsRepository;

public class PersonsCrud implements IPersons {

	@Autowired
	PersonsRepository personsRepository;

	@Override
	public void addPersons(Iterable<Person> persons) {
		personsRepository.save(persons);
		

	}

}
