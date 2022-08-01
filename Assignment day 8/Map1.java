/*Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/

import java.util.*;
public class Map1 {

	public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
		
		map.put("Candidate1", "Raj");
		map.put("Candidate2", "Rahul");
		map.put("Candidate3", "Simran");
		
		
		Iterator<Map.Entry<String, String> >   it = map.entrySet().iterator();
                           
		
		boolean Exist = false;
		String keychecked="candidate3";
		
		 while (it.hasNext()) {
			  
	           
	           
	                
			 Map.Entry<String, String>  entry = it.next();
	  
	            // 
			 
	            if (entry.getValue().equals(keychecked)) {
	  
	            	Exist  = true;
	            	break;
	            }
	        }
		 
		 System.out.println("Does key "  + keychecked+ " exists: "+ Exist);
	  
		
		 
		 // 
		 
		String valuecheck= "Rahul";
		Exist  = false;
		   it = map.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, String> entry = it.next();
				
				if (entry.getValue().equals(valuecheck)) {
					Exist  = true;
					break;
				}
			}
			System.out.println("Does value "  + valuecheck+ " exists: "+ Exist);
                    
                    
			
			
	//		
			it= map.entrySet().iterator();
			
			while (it.hasNext()) {
				Map.Entry<String, String> entry = it.next();
				System.out.println(entry);
				//System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			}
	}

}
