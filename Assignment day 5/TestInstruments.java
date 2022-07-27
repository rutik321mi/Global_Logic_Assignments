import java.util.Random;

abstract class Instrument{
	abstract void play();
}

class Piano extends Instrument {
	
	void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
	
}
class Flute extends Instrument {
	
	void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
	
}
class Guitar extends Instrument{
	void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}


public class TestInstruments {

	public static void main(String[] args) {
		Instrument inst[]= new Instrument[10];
		
    Random random = new Random();
	    
	    for (int j = 0; j < 10; j++) {
	    	int randomNum = random.nextInt((3-1)+1)+1;
	    	
	    	if (randomNum == 1)
	    		inst[j] = new Piano();
	    	else if (randomNum == 2)
	    		inst[j] = new Flute();
	    	else if (randomNum == 3)
	    		inst[j] = new Guitar();
	    	
	    	inst[j].play();
	    }
	    
	    for (int j = 0; j < 10; j++) {
	    	if (inst[j] instanceof Piano) 
	    		System.out.println("Piano is stored at index " + j);
	    	else if (inst[j] instanceof Flute) 
	    		System.out.println("Flute is stored at index " + j);
	    	else if (inst[j] instanceof Guitar) 
	    		System.out.println("Guitar is stored at index " + j);
	    }

	}

}
