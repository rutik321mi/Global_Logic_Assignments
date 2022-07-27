import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testStringConcat() {
		Demo1 ob= new Demo1();
		String s= ob.stringConcat("Good", "Bye");
		assertEquals("GoodBye",s);
	}

}
