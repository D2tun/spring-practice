package app4.test.spring.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import app4.test.spring.models.Person;

@Component
public class PersonDAO {
	
	private static final String DB_URL = "jdbc:postgresql://localhost:10000/peopleDB";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "285"; 
	private static Connection connection;
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	} 
	
	public List<Person> index() {		
		List<Person> people = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM person");
			while (rs.next()) {
				people.add(new Person(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("email")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return people;
	}
	
	public Person show(int id) {
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM person WHERE id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
	
			return new Person(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void save(Person person) {
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO person VALUES(6, ?, ?, ?)");
			ps.setInt(2, person.getAge());
			ps.setString(1, person.getName());
			ps.setString(3, person.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(int id, Person person) {
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE person SET name=?, age=?, email=? WHERE id=?");
			ps.setString(1, person.getName());
			ps.setInt(2, person.getAge());
			ps.setString(3, person.getEmail());
			ps.setInt(4, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM person WHERE id=?");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
