/*Write a java program that connects to oracle database, queries the inbuilt table “emp” and

displays the first two columns (empno using column index and ename using column name ) of all the rows.*/

package com.Jdbcproject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;

public class TwoCol {

	 public static void main(String[] args) throws Exception

	 {

	 Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
	 Statement st=con.createStatement();

	 String query="select empno,ename from emp";

	 ResultSet r = st.executeQuery(query);

	System.out.println("empno"+"	"+"ename");
	
        while(r.next()) {
         System.out.print(r.getInt(1)+"	 "+r.getString(2));
         System.out.println();
        
	 }
	
	if (st != null) st.close();		
	if (con != null) con.close();

	}
}




