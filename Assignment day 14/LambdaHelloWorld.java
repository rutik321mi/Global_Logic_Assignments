/*	Write a program in Java to demonstrate Java 8 Lambda Expression

Step1: create Java main class LambdaHelloWorld

Step2: create a interface HelloWorld with a method hello

Step3: Implement the hello method in LambdaHelloWorld class using lambda expression by passing displayWord as parameter

Step4: Print the displayWord by calling hello method of LambdaHelloWorld class

Sample input1

Enter the word to be displayed

John

Sample output1

Hello John

Sample input2

Enter the word to be displayed

Micheal

Sample output2

Hello Micheal
*/
import java.util.*;
interface HelloWorld {
	
	void hello(String p);
}
public class LambdaHelloWorld {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 HelloWorld h = (String s) -> System.out.println("Hello " + s);
		    System.out.println("Enter the word to be displayed");
		    String str= sc.next();
		    h.hello(str);
		    sc.close();
	}

}
