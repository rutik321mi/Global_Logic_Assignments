//Initialize two character variables in a program and display the characters in alphabetical order. 
 
import java.util.*;
public class Third {

	public static void main(String[] args) {
		char a,b;
	Scanner sc= new Scanner(System.in);
System.out.println("Enter two alphabets");
	a = sc.next().charAt(0);
	b = sc.next().charAt(0);
if(a>b)
	System.out.println(b+" "+a);
	
 else if(b>a)
	 System.out.println(a+" "+b);
else
	System.out.println(a+" "+b);

		}
		
    
}
