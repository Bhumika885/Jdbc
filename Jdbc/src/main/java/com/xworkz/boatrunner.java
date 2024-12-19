package com.xworkz;

import java.sql.DriverManager;
import java.sql.SQLException;

public class boatrunner {
    public static void main(String[]args){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/hat";
            String username="root";
            String password="Xworkzodc@123";
            DriverManager.getConnection(url,username,password);
            System.out.println("jdbc installation done successfully");
        } catch (ClassNotFoundException | SQLException classNotFoundException) {
            System.out.println("JDBC driver not found" + classNotFoundException);
        }
    }
}


