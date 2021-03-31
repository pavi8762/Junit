package test;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

public interface TestInterfaceDynamicTestsDemo {
	
	@TestFactory
	default Stream<DynamicTest> dynamicTestForPalindormes(){
		return Stream.of("racecar", "radar", "mom", "dad")
				.map(text-> DynamicTest.dynamicTest(text, () -> Assertions.assertTrue(StringFunctions.isPalindrome(text))));
	}
	
	@Test
	default void test2() {
		Assertions.assertTrue(StringFunctions.isPalindrome("mom"));
		
		
	}

}
