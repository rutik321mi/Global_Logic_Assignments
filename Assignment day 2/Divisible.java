//Write a program to print first 5 values which are divisible by 2, 3, and 5.
public class Divisible {

	public static void main(String[] args) {
		int count=0,n=1;
		while(count<5) {
			if((n%2==0) && (n%3==0)&& (n%5==0)) {
				System.out.println(n);
			count++;
			}
			n++;
		}

	}

}
