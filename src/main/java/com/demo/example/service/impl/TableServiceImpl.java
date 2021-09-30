package com.demo.example.service.impl;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;


public class TableServiceImpl {

	public static void displayTable() throws SQLException {

//		Class.forName("com.mysql.jdbc.Driver");
//
//		Connection con = DriverManager.getConnection(
//				"jdbc:mysql://localhost:3306/user?createDatabaseIfNotExist=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
//						+ "user=root&password=root");
//		PreparedStatement st = con.prepareStatement("select * from user");
//		ResultSet r1 = st.executeQuery();
//
//		return r1;

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/user?createDatabaseIfNotExist=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "root";
		String password = "password";
		
		try {
			
			connection = Database.getConnection();
		} catch(Exception e) {
			
		}
	}
}
