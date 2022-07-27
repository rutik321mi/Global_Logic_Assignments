package assignment4;

import java.util.Scanner;
public class CharCopy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		String res = "";
		for(int i=0;i<=1;i++) {
			res += s.charAt(i);
		}
		
		String output = "";
		for(int i=0;i<s.length();i++) {
			output += res;
		}
		
		System.out.println("After Copying the character 'n' times : " +output);
		
		sc.close();
	}
}
