package com.xworkz.jdbc;

import java.sql.DriverManager;

public class two {


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/two";
            String username = "root";
            String password = "Xworkzodc@123";

            DriverManager.getConnection(url, username, password);
            System.out.println("jdbc installed successfully");

        }catch
            (Exception e){
            e.printStackTrace();

            }

    }
}