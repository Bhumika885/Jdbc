package com.xworkz.net;

public class BoatRunner {
	
	
public static void main(String[]args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("''''''''");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();	
		}
	}
}






