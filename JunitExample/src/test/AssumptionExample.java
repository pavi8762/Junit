package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;

public class AssumptionExample {
	
	@Test
	public void AssumpitonsTest() {
		
		System.out.println("Inside Assumption test");
		
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
		
		Assertions.assertEquals(7,  Calculator.add(4, 3));
	}
	
	/*@Test
	public void AssumpitonsTest() {
		
		System.out.println("Inside Assumption test");
		
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
		
		Assertions.assertEquals(7,  Calculator.add(4, 3));
	}*/

	
}
