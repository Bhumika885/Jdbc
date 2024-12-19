package com.xworkz;

import java.sql.DriverManager;

public class kite {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dog";
            String username = "root";
            String password = "Xworkzodc@123";
            DriverManager.getConnection(url, username, password);
            System.out.println("jdbc installed succesfully");
        } catch (Exception e){
            e.printStackTrace();

            }
    }
}
