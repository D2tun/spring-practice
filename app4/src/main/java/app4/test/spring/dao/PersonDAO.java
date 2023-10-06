package app4.test.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import app4.test.spring.models.Person;

@Component
public class PersonDAO {
	
	private static int peopleCount = 0;
	private List<Person> people = new ArrayList<>();
	
	
	public List<Person> index() {
		return this.people;
	}
	
	public Person show(int id) {
		return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
	}
	
	public void save(Person person) {
		person.setId(peopleCount++);
		this.people.add(person);
	}
	
	public void update(int id, Person person) {
		Person personToUpdate = this.show(id);
		personToUpdate.setName(person.getName());
		personToUpdate.setAge(person.getAge());
		personToUpdate.setEmail(person.getEmail());
	}
	
	public void delete(int id) {
		this.people.removeIf(p -> p.getId() == id);
	}
}
