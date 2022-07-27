import java.util.*;
public class Search {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
	int arr[]= new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
	System.out.println("Enter element to be searched");
	int k= sc.nextInt(),flag=0;
	for(int i=0;i<n;i++) {
		if(arr[i]==k) {
			System.out.println("element is at "+i+"th position");
			flag=1;
			break;
		}

	}
if(flag==0)
	System.out.println(-1);
sc.close();
	}

}
