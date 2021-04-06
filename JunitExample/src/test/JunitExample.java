package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ConditionCheck.class)
public class JunitExample {
	
	@BeforeAll
	static void setup() {
		System.out.println("@Before All executed");
	}
	
	
	@BeforeEach
	void tearThis() {
		System.out.println("@BeforeEach executed");
	}
	
	//@Disabled
	@HighPriority
	
	public void test1() {
		System.out.println("first Junit");
		
	}
	
	@Tag("Medium")
	@Test
	public void test2() {
		System.out.println("Second Junit");
		
	}
	
	@Tag("Low")
	@Test
	public void test3() {
		System.out.println("Third Junit");
	}
	
	
	
	@AfterEach
	void setupThis() {
		System.out.println("@AfterEach executed");
	}
	

	@AfterAll
	static void tear() {
		System.out.println("AfterAll executed");
	}

}
