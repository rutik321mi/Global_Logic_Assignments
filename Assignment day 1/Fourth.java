import java.util.*;
public class Fourth {

	public static void main(String[] args) {
		char var;
		Scanner sc= new Scanner(System.in);
		var=sc.next().charAt(0);
	if(var>='a' && var<='z' || var>='A' && var<='Z') {
		System.out.println("it is alphabet");
	}
	else if(Character.isDigit(var)) {
		System.out.println("it is Digit");
	}
	else 
		System.out.println("it is special symbol");

	}

}
