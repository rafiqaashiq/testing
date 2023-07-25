package com.Simplilearn.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Demo8 {

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	public void test1(int i) {
		System.out.println(i);
	}

	@ParameterizedTest
	@ValueSource(strings = { "4", "5", "6" })
	public void test2(String s) {
		assertTrue(Integer.parseInt(s) < 6);
	}
}
