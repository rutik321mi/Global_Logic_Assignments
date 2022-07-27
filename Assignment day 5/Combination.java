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
