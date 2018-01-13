package telran.persons.entities;

import java.time.LocalDate;


public class Employee extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7173862379468304883L;
	String company;
	int salary;

	public Employee(int id, String name, LocalDate birthdate, Address address, String company, int salary) {
		super(id, name, birthdate, address);
		this.company = company;
		this.salary = salary;
	}

	public Employee() {

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + ", salary=" + salary + ", id=" + id + ", name=" + name + ", birthdate="
				+ birthdate + ", address=" + address + "]";
	}

}
