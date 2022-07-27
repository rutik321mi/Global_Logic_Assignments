import java.util.*;
public class MonthTree {

	public static void main(String[] args) {
		Set<String> ob = new TreeSet<>();
		  
     
        ob.add("Jan");
        ob.add("Feb");
        ob.add("Mar");
        ob.add("April");
        ob.add("May");
        ob.add("Jun");
        ob.add("July");
        ob.add("Aug");
        ob.add("Sept");
        ob.add("Oct");
        ob.add("Nov");
        ob.add("Dec");
        System.out.println(ob);
      //printing using iterator  
        Iterator<String> i=ob.iterator();

        while(i.hasNext())

        {

          System.out.println(i.next());

        }

	}

}
