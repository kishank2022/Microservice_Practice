package com.javaInterview.question.sqlIngection;

/*
 SQL Injection - SQL Injection is a type of security vulnerability where an attacker injects malicious SQL code 
 	into an application's input fields in order to manipulate the database.
 	It occurs when user input is concatenated directly into an SQL query without proper validation.
 	
 String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
 suppose attackers enter username = admin' OR '1'='1
 						password = password
 so our query becomes 
 SELECT * FROM users WHERE username = 'admin' OR '1'='1' AND password = 'password';
 here 1=1 always return true, so the attacker will get enter into the system.
 
 to prevent this attack we should not directly append the user input into the query,
 we should use proper validation, PreparedStatement,   
 
  
  
 */

public class SQL_Injection {

	
	
}


