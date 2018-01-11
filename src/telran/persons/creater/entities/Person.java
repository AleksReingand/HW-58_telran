package telran.persons.creater.entities;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;


public abstract class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7058957662599263830L;
	@Id
	int id;
	String name;
	LocalDate birthdate;
	Address address;

	@Override
	public abstract String toString();

	public Person() {

	}

	public Person(int id, String name, LocalDate birthdate, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

}
