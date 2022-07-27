import java.util.*;
public class LarSmal2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
	int arr[]= new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}

		Arrays.sort(arr);
		System.out.println("First largest element is "+ arr[n-1]+" and Second largest element is "+arr[n-2]);
		System.out.println("First Smallest element is "+ arr[0]+" and Second Smallest element is "+arr[1]);
		sc.close();
	}

}
