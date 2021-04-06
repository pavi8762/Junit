package test.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassATest {
	
	@Test
    public void testLucky() {
        Assertions.assertEquals(7, ClassA.getLucky());
    }


}

