import java.util.*;

class Employee{
	int empId;
String empName;
String email;
String gender;
float salary;
public Employee(int empId, String empName, String email, String gender, float salary) {
	this.empId = empId;
	this.empName = empName;
	this.email = email;
	this.gender = gender;
	this.salary = salary;
}

public String GetEmployeeDetails() {
	return "EmpId=" + empId + "  EmpName=" + empName + "  EmpEmail=" + email 
			+ "  EmpGender=" + gender + "  EmpSalary=" + salary ;
}
public int getEmpId() {
	return empId;
}




public float getEmpSalary() {
	return salary;
}


	
}




 class EmployeeDb {

ArrayList<Employee> list= new ArrayList<Employee>();


public boolean addEmployee(Employee e) {
	return list.add(e);
}




public boolean deleteEmployee(int empId) {
	boolean isRemoved = false;
	
	Iterator<Employee> it = list.iterator();
	
	while (it.hasNext()) {
		Employee emp = it.next();
		if (emp.getEmpId() == empId) {
			isRemoved = true;
			it.remove();
		}
	}
	
	return isRemoved;
}


public String showPaySlip(int empId) {
	String paySlip = "Invalid employee id";
	
	for (Employee e : list) {
		if (e.getEmpId() == empId) {
			paySlip = "Pay slip/ salary for employee id " + empId + " is " +
					e.getEmpSalary();
		}
	}

	return paySlip;
}

public Employee[] listAll() {
	Employee[] empArray = new Employee[list.size()];
	for (int i = 0; i < list.size(); i++)
		empArray[i] = list.get(i);
	return empArray;
}
}

 
 
 
public class EmployeeTest{
	public static void main(String[] args) {
		
	
	EmployeeDb empDb = new EmployeeDb();
	
	Employee e1 = new Employee(143, "Ram", "xyz@gmail.com", "Male", 2452.3f);
	Employee e2 = new Employee(10, "Raju", "pqr@gmail.com", "Female", 3434.3f);
	Employee e3 = new Employee(45, "Rahul", "abc@gmail.com", "Female", 8720.4f);
	Employee e4 = new Employee(99, "Mr. Bean", "mno@gmail.com", "Male", 53443.34f);
	
	empDb.addEmployee(e1);
	empDb.addEmployee(e2);
	empDb.addEmployee(e3);
	empDb.addEmployee(e4);

	for (Employee e : empDb.listAll())
		System.out.println(e.GetEmployeeDetails());
	
	System.out.println();
	
	empDb.deleteEmployee(99);
	
	for (Employee e : empDb.listAll())
		System.out.println(e.GetEmployeeDetails());
	
	System.out.println();
	
	System.out.println(empDb.showPaySlip(10));
}
}	
	
	
	
	

