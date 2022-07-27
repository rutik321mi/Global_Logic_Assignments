package assignment4;

import java.util.Scanner;
public class HalfStringReturn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		if(s.length() % 2 == 0) {
			int num = s.length()/2;
			
			String res = "";
			for(int i=0;i<num;i++) {
				res += s.charAt(i);
			}
			System.out.println("Even Length String Output : "+res);
		}
		
		else {
			System.out.println("null");
		}
		
		sc.close();
	}
}
