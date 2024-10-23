package com.xworkz.jdb;

public class FlightRunner {
	
	
public static void main(String[]args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("---------");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();	
		}
	}
}



