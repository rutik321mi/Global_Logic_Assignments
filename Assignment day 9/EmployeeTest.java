import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
class EmployeeTest {
	
ArrayList<String> list= new ArrayList<>();
{
list.add("Ram");
list.add("Michael");
list.add("Rohan");
list.add("Rajesh");
list.add("Raju");
}

Employee ob= new Employee();
	@Test
	void testFindName() {
		String res="FOUND";
		System.out.println(list);
		assertEquals(res,ob.findName(list,"Rajesh"));
		assertEquals("NOT FOUND",ob.findName(list,"Rakesh"));
	}

}
