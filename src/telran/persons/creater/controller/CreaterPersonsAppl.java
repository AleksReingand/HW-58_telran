package telran.persons.creater.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import telran.persons.creater.entities.*;
import telran.persons.creater.interfaces.IPersons;

public class CreaterPersonsAppl {

	private static final int Q_EMPLOEEY = 100;
	private static final int Q_CHILD = 30;
	static int id = 0;

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("src/beans.xml");
		IPersons personsCrud = ctx.getBean(IPersons.class);
		personsCrud.addPersons(Arrays.asList(createPersons()));
		ctx.close();

	}

	private static Person[] createPersons() {
		int i = 0;
		Person[] persons = new Person[Q_EMPLOEEY + Q_CHILD];
		while (i < Q_EMPLOEEY) {
			persons[i] = createEmployee();
			i++;
		}
		while (i < Q_EMPLOEEY + Q_CHILD) {
			persons[i] = createChild();
			i++;
		}
		return persons;
	}

	private static Child createChild() {
		LocalDate fromDate = LocalDate.of(2013, 1, 1);
		LocalDate toDate = LocalDate.now().minusDays(90);
		id = createID();
		String name = PersonData.name[(genRandomNum(0, PersonData.name.length - 1))];
		LocalDate birthdate = getRandomBirthDate(fromDate, toDate);
		String kindergarten = PersonData.kindergarten[(genRandomNum(0, PersonData.kindergarten.length - 1))];
		Child child = new Child(id, name, birthdate, createAddress(), kindergarten);
		return child;
	}

	private static Employee createEmployee() {
		LocalDate fromDate = LocalDate.of(1950, 1, 1);
		LocalDate toDate = LocalDate.now().minusYears(16);
		id = createID();
		String name = PersonData.name[(genRandomNum(0, PersonData.name.length - 1))];
		LocalDate birthdate = getRandomBirthDate(fromDate, toDate);
		String company = PersonData.company[(genRandomNum(0, PersonData.company.length - 1))];
		int salary = genRandomNum(5000, 50000);
		Employee employee = new Employee(id, name, birthdate, createAddress(), company, salary);
		return employee;
	}

	private static LocalDate getRandomBirthDate(LocalDate fromDate, LocalDate toDate) {
		Random gen = new Random();
		return toDate.minusDays(1 + gen.nextInt((int) ((ChronoUnit.DAYS.between(fromDate, toDate)) - 1)));

	}

	private static int createID() {
		return ++id;
	}

	private static Address createAddress() {

		String city = PersonData.cities[genRandomNum(0, PersonData.cities.length - 1)];
		String street = PersonData.streets[genRandomNum(0, PersonData.streets.length - 1)];
		int building = genRandomNum(1, 100);
		int aprt = genRandomNum(1, 100);
		Address address = new Address(city, street, building, aprt);
		return address;
	}

	private static int genRandomNum(int min, int max) {
		return (int) (min + Math.random() * (max - min));
	}

}
