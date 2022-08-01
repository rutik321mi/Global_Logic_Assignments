//Write a program to initialize an integer array and print the sum and average of the array
import java.util.*;
public class SumAvg {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
	int arr[]= new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int sum=0,avg=0;
	for(int i=0;i<n;i++) {
		sum+=arr[i];
	}
	avg= sum/n;
 System.out.println("Sum is "+sum);
 System.out.println("Avg is "+ (avg));
 sc.close();
	}

}
