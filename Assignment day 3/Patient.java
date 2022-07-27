import java.util.*;
public class Patient {
	
	
Double bmi(Double h,Double w) {
	Double b= w/(h*h);
	return b;
}


	public static void main(String[] args) {
		String name;
		Double h,w;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name of person");
		name=sc.next();
		System.out.println("Enter height of person in meter");
		h=sc.nextDouble();
		System.out.println("Enter weight of person in Kg");
		w=sc.nextDouble();
		Patient obj= new Patient();
		System.out.println("BMI of "+name+" is "+obj.bmi(h,w));
		sc.close();
	}

}
