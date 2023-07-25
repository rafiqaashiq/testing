package com.Simplilearn.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Demo9 {

	@ParameterizedTest
	@CsvSource({"test, TEST", "monDAy, MONday", "July, july"})
	public void test1(String actual, String expected) {
		String actualValue = actual.toLowerCase();
		String expectedValue = expected.toLowerCase();
		assertEquals(actualValue, expectedValue);
	}
}
