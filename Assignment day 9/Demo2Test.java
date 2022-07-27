import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {
Demo2 ob= new Demo2();
	@Test
	void testPalindromeCheck() {
		boolean res= true;
	assertEquals(res,ob.palindromeCheck("MoM"));
	assertEquals(res,ob.palindromeCheck("malayalam"));
	}

}
