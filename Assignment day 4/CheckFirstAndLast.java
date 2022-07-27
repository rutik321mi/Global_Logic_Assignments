package assignment4;

import java.util.Scanner;
public class CheckFirstAndLast {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x') {
			String res = s.substring(1,s.length()-1);
			System.out.println("After removing 'x' : "+res);
		}
		
		else {
			System.out.println("Output will be : "+s);
		}
		
		sc.close();
	}
}
