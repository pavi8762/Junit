package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssumptionEx {
	
	@Test
	@DisplayName(value = "adding two positive numbers")
	
	void testInAllEnvironments() {
		System.setProperty("ENV", "CI");
		//assumingThat("CI".equals(System.getenv("ENV")),
				()-> {
					assertEquals(60,Calculator.add(40,20));
					
				});
		
		
		
		assertEquals(130,Calculator.add(60, 70));
	}
	
	
	

	@Test
	public void AssumptionsEx() {
		System.out.println("Inside Assumption Test");
		
		System.setProperty("ENV", "PROD");
		assumeFalse("DEV".equals(System.getProperty("ENV")), "Failure Test");
		
		Assertions.assertEquals(7, Calculator.add(4, 3));
		
		
	}

}
