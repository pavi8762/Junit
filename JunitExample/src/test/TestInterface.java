package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInterface implements TestInterfaceDynamicTestsDemo{
	
	@Test
	void testCalcTwo() {
		System.out.println("====Test two executed===");
		Assertions.assertEquals(6, Calculator.add(2,4));
	}

	
}
