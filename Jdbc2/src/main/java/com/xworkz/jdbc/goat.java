package com.xworkz.jdbc;

import java.sql.DriverManager;

public class goat{

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/goat";
            String username = "root";
            String password = "Xworkzodc@123";

            DriverManager.getConnection(url, username, password);
            System.out.println("jdbc successfully installed");
        }catch(Exception e){
            e.printStackTrace();
            }



            }

    }
