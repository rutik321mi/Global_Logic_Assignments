/* * Write a program to accept gender ("Male" or "Female") and age (1-120) 
 * from command line arguments and print the percentage of interest based on the given conditions.
 * Interest == 8.2% 
 * Gender ==> Female
 * Age    ==>1 to 58
 * Interest == 7.6% 
 * Gender ==> Female
 * Age    ==>59 -120
 * Interest == 9.2% 
 * Gender ==> Male
 * Age    ==>1-60
 * Interest == 8.3% 
 * Gender ==> Male
 * Age    ==>61-120 */


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
