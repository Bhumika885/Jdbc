package com.xworkz.jdbc;

import java.sql.DriverManager;

public class joker {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "root";
            String password = "Xworkzodc@123";
            String url = "jdbc:mysql://localhost:3306/cat";
            DriverManager.getConnection(url,username,password);
            System.out.println("jdbc installed successfully");
        } catch(Exception e ){
            e.printStackTrace();
        }
    }
}


