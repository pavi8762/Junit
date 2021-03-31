package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JunitExample {
	
	@BeforeAll
	static void setup() {
		System.out.println("@Before All executed");
	}
	
	
	@BeforeEach
	void tearThis() {
		System.out.println("@BeforeEach executed");
	}
	
	@Disabled
	@Test
	public void test1() {
		System.out.println("first Junit");
		
	}
	
	@Test
	public void test2() {
		System.out.println("Second Junit");
		
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
