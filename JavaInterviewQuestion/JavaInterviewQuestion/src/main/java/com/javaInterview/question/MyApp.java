package com.javaInterview.question;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyApp {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/docker_java_mysql";
        String user = "root";
        String password = "root";
        
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to MySQL successfully using docker network!!");
        con.close();
    }
}
