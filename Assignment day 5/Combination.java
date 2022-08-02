/*Given two strings, a and b, print a new string which is made of the following combination-first 
character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod
*/

import java.util.*;
public class Combination {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a= sc.next();
		String b= sc.next();
		StringBuffer c= new StringBuffer();
	
		int i = 0;
		while( i < a.length() || i < b.length()) {
			 
            if (i < a.length())
                c.append(a.charAt(i));
 
            // Then choose the ith character of the
            // second string if it exists
            if (i < b.length())
                c.append(b.charAt(i));
            i++;
        }
		System.out.println(c.toString());
 
		sc.close();
	}

}
