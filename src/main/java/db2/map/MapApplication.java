package db2.map;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class MapApplication {

	public static Connection cn;

	public static void connect() {
		try {
			Class.forName("org.postgresql.Driver");
			cn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/", "postgres", "postgres");
			if (cn != null) {
				System.out.println("Connection successfull");
			} else {
				System.out.println("Connection failed");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		/* Start app */
		connect();
	}
}