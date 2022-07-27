
import java.util.Random;

abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment {

	
	public String notice() {
		
		return "This is First Class Compartment";
	}
	
}

class Ladies extends Compartment {

	
	public String notice() {
		return "This is Ladies Compartment";
	}
	
}

class General extends Compartment {


	public String notice() {
		return "This is General Compartment";
	}
	
}

class Luggage extends Compartment {

	
	public String notice() {
		
		return "This is Lugguage Compartment";
	}
	
}

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] c = new Compartment[10];

		Random random = new Random();
		
	    	for (int i = 0; i < 10; i++) {
	    		int randomNum = random.nextInt((4 - 1) + 1) + 1;
	    	
	    		if (randomNum == 1)
	    			c[i] = new Luggage();
	    		else if (randomNum == 2)
	    			c[i] = new Ladies();
	    		else if (randomNum == 3)
	    			c[i] = new General();
	    		else if (randomNum == 4)
	    			c[i] = new FirstClass();
	    	
	    		System.out.println(c[i].notice());
	    	}
	}

}