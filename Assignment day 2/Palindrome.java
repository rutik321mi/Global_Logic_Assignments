import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int temp= n;
	int reverse=0;
	while(n>0) {
		int ld= n%10;
		reverse=(reverse*10)+ld;
		n/=10;
	}
	if(temp==reverse)
	System.out.println("palindrome");
	else
		System.out.println("Not palindrome");
	sc.close();
	}

	}

