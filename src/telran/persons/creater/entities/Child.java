package telran.persons.creater.entities;

import java.time.LocalDate;


public class Child extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7426387613528133010L;
	String kindergarten;

	public Child(int id, String name, LocalDate birthdate, Address address, String kindergarten) {
		super(id, name, birthdate, address);
		this.kindergarten = kindergarten;
	}

	public Child() {

	}

	@Override
	public String toString() {
		return "Child [kindergarten=" + kindergarten + ", id=" + id + ", name=" + name + ", birthdate=" + birthdate
				+ ", address=" + address + "]";
	}

	public String getKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(String kindergarten) {
		this.kindergarten = kindergarten;
	}

}
