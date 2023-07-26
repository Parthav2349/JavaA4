package com.example.assignment4;

import java.sql.Connection;
import java.sql.DriverManager;

public class databaseConnection {
	public Connection databaseLink;
	
	public Connection getConnection() {
		String databaseName="Assignment4";
		String databaseUser = "root";
		String databasePassword = "Pk23492112";
		String url = "jdbc:mysql://localhost/" + databaseName;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return databaseLink;
	}
}
