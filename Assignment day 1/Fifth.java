import java.util.*;
public class Fifth {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		System.out.println("Enter Gender ");
		String gen= sc.next();
		System.out.println("Enter Age ");
		int age= sc.nextInt();
	if(gen.equals("Female") && (age>=1 && age<=58) ) {
		System.out.println(" percentage of interest is 8.2%");
	}
	else if(gen.equals("Female") && (age>=59 && age<=100) ) {
		System.out.println(" percentage of interest is 9.2%");
	}
	else if(gen.equals("Male") && (age>=1 && age<=58) ) {
		System.out.println(" percentage of interest is 8.4%");
	}
	else if(gen.equals("Male") && (age>=59 && age<=100) ) {
		System.out.println(" percentage of interest is 10.5%");
	}

	}

}
