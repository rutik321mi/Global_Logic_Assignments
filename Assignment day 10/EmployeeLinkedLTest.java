import java.util.LinkedList;
import java.util.Iterator;

class EmployeeL{
	int empId;
String empName;
String email;
String gender;
float salary;
public EmployeeL(int empId, String empName, String email, String gender, float salary) {
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




 class EmployeeDbL {

LinkedList<EmployeeL> list= new LinkedList<EmployeeL>();


public boolean addEmployee(EmployeeL e) {
	return list.add(e);
}




public boolean deleteEmployee(int empId) {
	boolean isRemoved = false;
	
	Iterator<EmployeeL> it = list.iterator();
	
	while (it.hasNext()) {
		EmployeeL emp = it.next();
		if (emp.getEmpId() == empId) {
			isRemoved = true;
			it.remove();
		}
	}
	
	return isRemoved;
}


public String showPaySlip(int empId) {
	String paySlip = "Invalid employee id";
	
	for (EmployeeL e : list) {
		if (e.getEmpId() == empId) {
			paySlip = "Pay slip/ salary for employee id " + empId + " is " +
					e.getEmpSalary();
		}
	}

	return paySlip;
}

public EmployeeL[] listAll() {
	EmployeeL[] empArray = new EmployeeL[list.size()];
	for (int i = 0; i < list.size(); i++)
		empArray[i] = list.get(i);
	return empArray;
}
}

 
 
 

	
public class EmployeeLinkedLTest {
	public static void main(String[] args) {
		
		
		EmployeeDbL empDb = new EmployeeDbL();
		
		EmployeeL e1 = new EmployeeL(143, "Ram", "xyz@gmail.com", "Male", 2452.3f);
		EmployeeL e2 = new EmployeeL(10, "Raju", "pqr@gmail.com", "Female", 3434.3f);
		EmployeeL e3 = new EmployeeL(45, "Rahul", "abc@gmail.com", "Female", 8720.4f);
		EmployeeL e4 = new EmployeeL(99, "Mr. Bean", "mno@gmail.com", "Male", 53443.34f);
		
		empDb.addEmployee(e1);
		empDb.addEmployee(e2);
		empDb.addEmployee(e3);
		empDb.addEmployee(e4);

		for (EmployeeL e : empDb.listAll())
			System.out.println(e.GetEmployeeDetails());
		
		System.out.println();
		
		empDb.deleteEmployee(99);
		
		for (EmployeeL e : empDb.listAll())
			System.out.println(e.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(10));
	}
}
