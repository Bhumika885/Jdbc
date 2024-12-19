package com.xworkz.jdbc;

import com.sun.org.apache.xml.internal.security.c14n.implementations.Canonicalizer20010315ExclWithComments;

import java.sql.DriverManager;

public class pot {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/pot";
            String username = "root";
            String password = "Xworkzodc@123";

            DriverManager.getConnection(url, username, password);

            System.out.println("jdbc installed successfully");
        } catch(Exception e){
            e.printStackTrace();
        }


    }
}
