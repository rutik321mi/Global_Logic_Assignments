package com.Jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

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
do {
System.out.print("Enter rollno: ");
String rollstr = sc.nextLine();

try {
Rollno = Integer.parseInt(rollstr);
if (String.valueOf(Rollno).length() != 4) Rollno = 0;
} catch (Exception e) {}
} while (Rollno == 0);

System.out.println("Enter Fees");
int fees= sc.nextInt();
try {
	       // update
				String query = "update student set fees = ? where Rollno = ?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, fees);
				ps.setInt(2, Rollno);
				
				if (ps.executeUpdate() == 1)
					System.out.println("Fees of student having rollno = " + Rollno + " updated successfully");
				else
					System.out.println("Error / Invalid Roll no");
			} catch (SQLException e) {
				e.printStackTrace();
			}	
sc.close();
con.close();	
  }		

}


