import java.util.Iterator;
import java.util.Vector;
class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}



public class IteratorEnum {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(1, "Ram", "abc , India", 454.4));
		list.add(new Employee(2, "Sita", "xyz , India", 33.34));
		list.add(new Employee(3, "Lakshman", "pqr , India", 343.3));
		list.add(new Employee(4, "Ravan", "dfd , India", 232.4));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}
