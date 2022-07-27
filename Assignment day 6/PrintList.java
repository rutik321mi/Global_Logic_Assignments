import java.util.*;
public class PrintList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");
		list.add("element 5");
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}
