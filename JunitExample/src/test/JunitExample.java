package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JunitExample {
	
	@BeforeAll
	static void setup() {
		System.out.println("Before All executed");
	}
	
	@Test
	public void test1() {
		System.out.println("first Junit");
		
	}

}
