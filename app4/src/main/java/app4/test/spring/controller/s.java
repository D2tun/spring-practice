package app4.test.spring.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class s {

	private static final String DB_URL = "jdbc:postgresql://localhost:10000/peopleDB";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "285"; 
	private static Connection connection;
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM person");
			rs.next();
			System.out.println(rs.getString("name"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	

	}

}
