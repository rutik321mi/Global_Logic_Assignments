/*Inserting a record

ABC International School wants to computerize students details. The school maintains a database of students in MYSQL.

The student table contains information related to students and is shown in the following student table structure.

Column Name Type Constraint

Rollno Number (4) Primary Key

StudentName Varchar (20) Not Null

Standard Varchar (2) Not Null

Date_Of_Birth Date

Fees Number (9,2)

 When a new student joins the school, the student record is inserted in the student table.

 The valid student details are as follows:

• Rollno: Valid value is a 4-digit number

• StudentName: Valid value can contain maximum 20 letters in uppercase

• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)

Write a Java program to insert some records to the table*/


package com.Jdbcproject;
import java.sql.*;
import java.util.*;


public class Student {

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

String StudentName = "";
boolean lowercasefound;
do {
System.out.print("Enter name: ");
StudentName = sc.nextLine();

lowercasefound = false;
for (int i = 0; i < StudentName.length(); i++) {
if (Character.isLowerCase(StudentName.charAt(i))) {
lowercasefound = true;
break;
}
}

} while (StudentName.length() > 20 || lowercasefound);

String Standard = "";
String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
List<String> list = new ArrayList<String>(Arrays.asList(standards));
do {
System.out.print("Enter standard: ");
Standard = sc.nextLine();
} while (!list.contains(Standard));



// inserting data into db
String query = "INSERT INTO student VALUES(?, ?, ?)";
PreparedStatement ps =con.prepareStatement(query); 
try {
ps.setInt(1, Rollno);
ps.setString(2, StudentName);
ps.setString(3, Standard);

ps.executeUpdate();
System.out.println("Student added successfully");
} catch (SQLException e) {
e.printStackTrace();
System.out.println("Error");

con.close();
} 

sc.close();
}

}