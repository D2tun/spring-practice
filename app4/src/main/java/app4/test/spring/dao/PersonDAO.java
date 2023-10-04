package app4.test.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import app4.test.spring.models.Person;

@Component
public class PersonDAO {
	
	private static int peopleCount = 0;
	private List<Person> people;

	{
		this.people = new ArrayList<>();
		
		this.people.add(new Person(peopleCount++, "Sam"));
		this.people.add(new Person(peopleCount++, "Jack"));
		this.people.add(new Person(peopleCount++, "Oswald"));
		this.people.add(new Person(peopleCount++, "Katy"));
	}
	
	
	public List<Person> index() {
		return this.people;
	}
	
	public Person show(int id) {
		return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
	}
}
