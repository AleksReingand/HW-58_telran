package telran.persons.creater.model;

import org.springframework.beans.factory.annotation.Autowired;

import telran.persons.creater.entities.Person;
import telran.persons.creater.interfaces.IPersons;
import telran.persons.creater.repository.PersonsRepository;

public class PersonsCrud implements IPersons {

	@Autowired
	PersonsRepository personsRepository;

	@Override
	public void addPersons(Iterable<Person> persons) {
		personsRepository.save(persons);
		

	}

}
