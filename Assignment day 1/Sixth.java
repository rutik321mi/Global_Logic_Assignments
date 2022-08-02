 /* Write a program to convert from upper case to lower case and vice versa of an alphabet
 and print the old character and new character as shown in example (Ex: a->A, M->m).
 */

import java.util.*;
public class Sixth {

	public static void main(String[] args) {
		char ch;
	Scanner sc= new Scanner(System.in);
System.out.println("Enter an Alphabet");
	ch = sc.next().charAt(0);
	if(ch>='A' && ch<='Z')
		System.out.println(Character.toLowerCase(ch));
		
	else if (ch>='a' && ch<='z')
		System.out.println(Character.toUpperCase(ch));
		
}
    
}
