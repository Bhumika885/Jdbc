package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TrainRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/arun";
		String userName = "root";
		String password = "Xworkzodc@123";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null) {
				System.out.println("Sucessfully Connected");
			} else {
				System.out.println("Not Connected");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}