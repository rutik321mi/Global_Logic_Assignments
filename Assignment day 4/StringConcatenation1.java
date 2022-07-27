package assignment4;

import java.util.Scanner;

public class StringConcatenation1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s1 = sc.next();
		
		String temp1[] = s1.split(",");
		
		if(temp1[0].charAt(temp1[0].length()-1) == temp1[1].charAt(0)) {
			String res = "";
			
			for(int i = 1;i<temp1[1].length();i++) {
			res += temp1[1].charAt(i);
			}
			String output = temp1[0].toLowerCase() + res.toLowerCase();
			System.out.println("After Concatenation : "+output);
		}
		
		else {
			String res = temp1[0].toLowerCase() + " " + temp1[1].toLowerCase();
			System.out.println("After Concatenation : "+res);
		}
		
		sc.close();
	}

}
