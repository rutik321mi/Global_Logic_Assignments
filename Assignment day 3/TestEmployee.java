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
