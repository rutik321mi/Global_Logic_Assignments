/*Modify the above program to display all the rows where sal is greater than 1000 and less than 2000.

 Display the columns ename, job, sal and comm.*/

package com.Jdbcproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;

public class GreaterThan {

	 public static void main(String[] args) throws Exception

	 {

	 Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
	 Statement st=con.createStatement();

	 String query="select ename,job,sal,comm from emp where sal> 1000 and sal< 2000";

	 ResultSet r = st.executeQuery(query);

	System.out.println("ename"+"	"+" job"+"		"+" sal"+"		"+"comm");
	while(r.next()) {
         System.out.print(r.getString("ename")+"	 ");
         System.out.print(r.getString("job")+"	 ");
         System.out.print(r.getDouble("sal")+"		");
         System.out.print(r.getDouble("comm")+"		");
         System.out.println("");
	 }

	}
}




