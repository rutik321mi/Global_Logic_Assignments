import java.util.*;
public class V {

	public static void main(String[] args) {
		Vector<String> ob = new Vector<String>(12);
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
        
        
        Iterator<String> i=ob.iterator();

        while(i.hasNext())

        {

          System.out.println(i.next());

        }


	}

}
