package com.Simplilearn.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Demo2 {

	@Test
	public void TestAssertions() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = {"one", "two","three"};
		String[] resultArray = {"one", "two", "three"};
		
		// check that two objects are equal
		assertEquals(str1,str2);
		
		// check that a condition is true
		assertTrue(val1<val2);
		
		//  check that a condition is false
		assertFalse(val1>val2);
		
		// check that an object is not null
		assertNotNull(str1);
		
		// check that an object is null
		assertNull(str3);
		
		// check of two object reference point to the same object
		assertSame(str4,str5);
		
		// check if two object references do not point to the same object
		assertNotSame(str1,str3);
		
		// check if 2 arrays are equal
		assertArrayEquals(expectedArray,resultArray);
	}
}
