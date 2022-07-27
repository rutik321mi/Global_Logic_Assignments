import java.util.Iterator;
import java.util.TreeSet;

public class TreeOperation {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("Bala");
		set.add("Amar");
		set.add("Rohan");
		set.add("Himal");
		Iterator<String> i = set.iterator();
		System.out.println("Element in original order");
		
		 while (i.hasNext()) {
		        System.out.println(i.next());
		     }
		 Iterator<String> ix = set.iterator();

		 
		String s = "Raju";
		boolean res = false;
		
		while (ix.hasNext()) {
			if (ix.next().equals(s)) {
				res = true;
				break;
			}
		}
		
		
		if (res) 
			System.out.println(s + " exists");
		else
			System.out.println(s + " doesn't exist");
		
		
		Iterator<String> it = set.descendingIterator();
	     System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }
		

	}

}