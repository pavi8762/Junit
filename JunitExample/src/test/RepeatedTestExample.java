package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

public class RepeatedTestExample {
	
	
	@RepeatedTest(3)
	void testCalcTwo() {
		System.out.println("====Test two executed===");
		Assertions.assertEquals(6, Calculator.add(2,4));
	}
	
	@RepeatedTest(value = 3, name= "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Multiplication")
	void multiply() {
		int a,b;
		 a=10;
		 b=20;
		 Assertions.assertEquals(200, (a*b), "Matched, TestStatus - Passed");
		 
	}
	
	@RepeatedTest(3)
	@DisplayName(value ="Calculator Test")
	void testCalcThree(RepetitionInfo repinfo) {
		
		System.out.println("CurrentTest:" +repinfo.getCurrentRepetition());
		Assertions.assertEquals(6,  Calculator.add(2, 4));
		
	}

}
