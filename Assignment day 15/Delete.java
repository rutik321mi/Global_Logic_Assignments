/*ABC International School wants to computerize students details. The school maintains a database of students in Oracle.

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

Write a Java program to insert some records to the table

2) Deleting a Student’s record

When a student leaves the school, the record related to that student needs to be deleted from the Student table.

The student’s roll no, whose record has to be deleted, should be passed as a command line argument.

Upon deletion, the Student details must be stored in another table named StudentLog which will maintain the details

such as Rollno, StudentName, Standard and Leaving_date.

3) Modification of Student record

When there is a change in the fee to be paid by a student, the respective row should be appropriately updated.

Pass the rollno from the command prompt along with the new fee amount and this amount should be reflected in the table

 for that particular student.

4) Display Student details

Write the code to display details of all the students, if no roll no. is passed, while executing the main program.

If while executing the main program, the roll no. is passed, then it should display the record of that particular student.



*/

package com.Jdbcproject;
import java.sql.*;
import java.util.*;


public class Delete {

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


try {
	//backup
String query= "insert into StudentLog select * from student where Rollno=?"	;
PreparedStatement ps =con.prepareStatement(query); 
ps.setInt(1, Rollno);	
	int i= ps.executeUpdate();
	
//delete
	query= "delete from student where Rollno=?";
	ps=con.prepareStatement(query);
	ps.setInt(1, Rollno);
	int j=ps.executeUpdate();
	if(i==1 && j==1)
		System.out.println("student record deleted successfully");
	else
		System.out.println("Error/Invalid Rollno");
}catch (SQLException e) {
	e.printStackTrace();
}		

sc.close();




con.close();
} 


}

