/* Write a program in Java to demonstrate Java 8 Lambda Initialization using Callable

Step1: create Java main class LambdaInitialization

Step2: Scan 2 inputs to pass it to Callable Interface call method

Step3: Using lambda expression implement the call method

Sample Input1

Enter the first animal to be stored in callable array

Lion

Enter the second animal to be stored in callable array

Tiger

Sample output1

Lion

Tiger

Sample Input2

Enter the first animal to be stored in callable array

Dog

Enter the second animal to be stored in callable array

Cat

Sample Output2

Dog*/



import java.util.*;
interface callable{
	
	abstract void call(String s1, String s2);
}
public class LambdaInitialization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first animal to be stored in callable array");
          String s1=sc.next();
          System.out.println("Enter the second animal to be stored in callable array");
          String s2=sc.next();
          callable c = (sa, sb) -> {
        	  System.out.println(s1);
        	  System.out.println(s2);
          };
          c.call(s1, s2);
	}

}
