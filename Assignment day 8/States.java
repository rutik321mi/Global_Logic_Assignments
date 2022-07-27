import java.util.*;
public class States {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		
		properties.setProperty("Goa", "Panji");
		properties.setProperty("Maharashtra", "Mumbai");
		properties.setProperty("Assam", "Dispur");
		properties.setProperty("Karnataka", "Bengaluru");

		Set<Map.Entry<Object, Object>> set = properties.entrySet();
		Iterator<Map.Entry<Object, Object>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<Object, Object> i = itr.next();
			System.out.println(i);
		}
	}

}