package com.Jdbcproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Display {

public static void main(String[] args) throws SQLException {
	
	
	Scanner sc = new Scanner(System.in);
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
	 

int Rollno = 0;
System.out.println("Enter Rollno");
try {
Rollno=sc.nextInt();
} catch (Exception e) {}

String query;
try {			
	// Display student data with according to input to Rollno
	if (Rollno != 0)
		query = "Select * from student where Rollno = ?";
	else 
		query = "select * from student";
	
	PreparedStatement ps = con.prepareStatement(query);
	if (Rollno != 0) ps.setInt(1, Rollno);
	ResultSet rs = ps.executeQuery();
	
	while (rs.next()) {
		int ROLLNO = rs.getInt("Rollno");
		String STUDENTNAME = rs.getString("StudentName");
		String STANDARD = rs.getString("Standard");
		String DATE_OF_BIRTH = rs.getString("date_of_birth");
		int FEES = rs.getInt("fees");
		
		System.out.println(ROLLNO + " " + STUDENTNAME + " " + STANDARD + 
				" " + DATE_OF_BIRTH + " " + FEES);
	}
} catch (SQLException e) {
	e.printStackTrace();
}		

sc.close();
}
}






