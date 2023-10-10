package app4.test.spring.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import app4.test.spring.models.Person;

@Component
public class PersonDAO {
	
	private final JdbcTemplate jdbct;
	
	public PersonDAO(JdbcTemplate jdbct) {
		this.jdbct = jdbct;
	}
	
	public List<Person> index() {		
		return this.jdbct.query("SELECT * FROM person", new BeanPropertyRowMapper<>(Person.class));
	}
	
	public Person show(int id) {
		return this.jdbct.query("SELECT * FROM person WHERE id=?", new Object[] {id}, new BeanPropertyRowMapper<>(Person.class)).stream().findAny().orElse(null);
	}
	
	public void save(Person person) {
		this.jdbct.update("INSERT INTO person VALUES(6, ?, ?, ?)", person.getName(), person.getAge(), person.getEmail());
	}
	
	public void update(int id, Person person) {
		this.jdbct.update("UPDATE person SET name=?, age=?, email=? WHERE id=?", person.getName(), person.getAge(), person.getEmail(), id);
	}
	
	public void delete(int id) {
		this.jdbct.update("DELETE FROM person WHERE id=?", id);
	}
}
