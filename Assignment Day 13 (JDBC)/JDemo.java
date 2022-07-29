/*insert record into emp table*/
package com.Jdbcproject;

	import java.sql.Connection;

	import java.sql.DriverManager;
	import java.sql.Statement;

	public class JDemo {

	 public static void main(String[] args) throws Exception

	 {

	 Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
	 Statement st=con.createStatement();

	 String query="insert into emp values(111,'santosh','arc',90000,04)";

	 int i=st.executeUpdate(query);

	 if(i>0)

	 {

	  System.out.println("success");

	 }
	 }

	}



