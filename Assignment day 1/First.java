import java.util.Scanner;
public class First {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	if(n>0)
		System.out.println("number is positive");
	else if(n<0)
		System.out.println("number is negative");
	else 
		System.out.println("number is zero");
	}

}
