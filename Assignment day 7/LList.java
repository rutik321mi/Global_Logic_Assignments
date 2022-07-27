import java.util.*;
public class LList {

	public static void main(String[] args) {
		LinkedList<String> ob = new LinkedList<String>();
		  
     
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
        //print using iterator
        Iterator<String> i=ob.iterator();

        while(i.hasNext())

        {

          System.out.println(i.next());

        }


	}

}
