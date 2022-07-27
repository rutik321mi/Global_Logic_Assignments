import java.util.*;
public class OutOfBound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of elements");
		int n= sc.nextInt();
int arr[]= new int[n];
System.out.println("Enter elements of an array" );



try {
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	
	System.out.println("Enter the index of the array element you want to access");
	int i=sc.nextInt();
    System.out.println();
	System.out.println("The array element at index 1 = "+arr[i]);
	System.out.println("The array element successfully accessed");
}

catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("java.lang.ArrayIndexOutOfBoundsException");
}
catch( InputMismatchException e){
	System.out.println("InputMismatchException");
	
}
sc.close();
	}

}
