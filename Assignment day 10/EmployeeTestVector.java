import java.util.Vector;
import java.util.Iterator;

class EmployeeV{
	int empId;
String empName;
String email;
String gender;
float salary;
public EmployeeV(int empId, String empName, String email, String gender, float salary) {
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




 class EmployeeDbV {

Vector<EmployeeV> list= new Vector<EmployeeV>();


public boolean addEmployee(EmployeeV e) {
	return list.add(e);
}




public boolean deleteEmployee(int empId) {
	boolean isRemoved = false;
	
	Iterator<EmployeeV> it = list.iterator();
	
	while (it.hasNext()) {
		EmployeeV emp = it.next();
		if (emp.getEmpId() == empId) {
			isRemoved = true;
			it.remove();
		}
	}
	
	return isRemoved;
}


public String showPaySlip(int empId) {
	String paySlip = "Invalid employee id";
	
	for (EmployeeV e : list) {
		if (e.getEmpId() == empId) {
			paySlip = "Pay slip/ salary for employee id " + empId + " is " +
					e.getEmpSalary();
		}
	}

	return paySlip;
}

public EmployeeV[] listAll() {
	EmployeeV[] empArray = new EmployeeV[list.size()];
	for (int i = 0; i < list.size(); i++)
		empArray[i] = list.get(i);
	return empArray;
}
}

 
 
 


public class EmployeeTestVector {
	public static void main(String[] args) {
		
		
		EmployeeDbV empDb = new EmployeeDbV();
		
		EmployeeV e1 = new EmployeeV(143, "Ram", "xyz@gmail.com", "Male", 2452.3f);
		EmployeeV e2 = new EmployeeV(10, "Raju", "pqr@gmail.com", "Female", 3434.3f);
		EmployeeV e3 = new EmployeeV(45, "Rahul", "abc@gmail.com", "Female", 8720.4f);
		EmployeeV e4 = new EmployeeV(99, "Mr. Bean", "mno@gmail.com", "Male", 53443.34f);
		
		empDb.addEmployee(e1);
		empDb.addEmployee(e2);
		empDb.addEmployee(e3);
		empDb.addEmployee(e4);

		for (EmployeeV e : empDb.listAll())
			System.out.println(e.GetEmployeeDetails());
		
		System.out.println();
		
		empDb.deleteEmployee(99);
		
		for (EmployeeV e : empDb.listAll())
			System.out.println(e.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(10));
	}
}
