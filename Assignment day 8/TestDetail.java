/*Create a Collection “ContactList” using HashMap to store name and phone number of contacts added. The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not. 
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/

import java.util.*;

class ContactList{
HashMap<String, Integer> contacts = new HashMap<>();
	
	public void addContact(String name, Integer number) {
		contacts.put(name, number);
	}
	

	
	
	
	public boolean doesContactNameExist(String name) {
		Set<Map.Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			
			if (me.getKey().equals(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean doesContactNumberExist(Integer number) {
		Set<Map.Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();

			//System.out.println(me.getValue() + " == " + number + " :: " + (me.getValue() == number));
			if (me.getValue().intValue() == number) {
				
				return true;
			}
		}
		
		return false;
	}
	
	public void listAllContacts() {
		Set<Map.Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			System.out.println(me);
		}

	}
	
	
	
	
	
	
	
	
}
public class TestDetail {

	public static void main(String[] args) {
ContactList c = new ContactList();
		
		c.addContact("Ravi", 9343434);
		c.addContact("Ramu", 2434232);
		c.addContact("XYZ", 900000);
				
		if(c.doesContactNameExist("XYZ"))
			System.out.println("XYZ Name(key) exist");
		else
			System.out.println("XYZ Name(key) does not exist");
		if(c.doesContactNameExist("Mona"))
			System.out.println("Mona Name(key) exist");
		else
			System.out.println("Mona Name(key) does not exist");
		if(c.doesContactNumberExist(98765432))
			System.out.println("98765432 Mobno(value) exist");
		else
			System.out.println("98765432 Mobno(value) does not exist");
		
		System.out.println();
		c.listAllContacts();

	}

}
