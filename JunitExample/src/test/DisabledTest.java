package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTest {
	
	
	@Disabled
	@Test
	void testCalcOne() {
		System.out.println("====Test one executed===");
		Assertions.assertEquals(5, Calculator.add(2,2));
	}
	
	@Test
	void testCalcTwo() {
		System.out.println("====Test two executed===");
		Assertions.assertEquals(6, Calculator.add(2,4));
	}


}
