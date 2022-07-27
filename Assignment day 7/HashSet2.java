import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Ram");
		set.add("Shyam");
		set.add("Sita");
		set.add("Geeta");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}