import java.util.*;
public class ParseString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String s= sc.next();
		try{
		int n= Integer.parseInt(s);
		System.out.println("The square value is: " + (n*n));
		System.out.println("The work has been done successfully");
		}
		catch(NumberFormatException e){
			
			System.out.println("Entered input is not a valid format for an integer.");
			
		}
		
		
		sc.close();
	}

}
