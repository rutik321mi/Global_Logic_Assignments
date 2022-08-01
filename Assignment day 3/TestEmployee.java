/*Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee that will inherit the Person class.
The other data members of the Employee class are annual salary (double), 
the year the employee started to work, and the national insurance number which is a String.
Save this in a file called Employee.java
Your class should have the necessary constructors and getter/setter methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
*/


class Employee extends Person{
	int  YOE;
	double Annualsal;
	String NationalIno;
	Employee(){
		  System.out.println("This is Sub Class");

		}
	public int getYOE() {
		return YOE;
	}
	public void setYOE(int yOE) {
		YOE = yOE;
	}
	public double getAnnualsal() {
		return Annualsal;
	}
	public void setAnnualsal(double annualsal) {
		Annualsal = annualsal;
	}
	public String getNationalIno() {
		return NationalIno;
	}
	public void setNationalIno(String nationalIno) {
		NationalIno = nationalIno;
	}
	
	
	
}
public class TestEmployee {

	public static void main(String[] args) {
		Employee obj= new Employee();
		  System.out.println(obj.name);
		  obj.setYOE(2013);
		  System.out.println(obj.getYOE());
		  obj.setAnnualsal(2075.56);
		  System.out.println(obj.getAnnualsal());
		  obj.setNationalIno("BKI000");
		  System.out.println(obj.getNationalIno());

	}

}
