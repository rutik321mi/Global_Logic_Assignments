import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
	int arr[]= new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
	int max=arr[0],min=arr[0];
	for(int i=1;i<n;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	 if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println("Max element is "+max);
	System.out.println("Min element is "+min);
	sc.close();
	}

}
