package com.veltech.junit;


import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator calculator=new Calculator();
	Object nullObj=null;
	
	@Test
    public void testAdd() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }
	
	@Test
	public void testAssertions() { 
		 // Assert equals 
		 assertEquals(5, calculator.add(2, 3)); 
		 // Assert true 
		 assertTrue(5 > 3); 
		 // Assert false 
		 assertFalse(5 < 3); 
		 // Assert null 
		 //assertNull(calculator); 
		 assertNull(nullObj);
		 // Assert not null 
		 assertNotNull(new Object()); 
	}

}
