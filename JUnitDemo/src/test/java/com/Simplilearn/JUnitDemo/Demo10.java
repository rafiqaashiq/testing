package com.Simplilearn.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Demo10 {

	@ParameterizedTest
	@ValueSource(strings = "Seconds")
	public void test1(TimeUnit arg) {
		// implicit conversion
		System.out.println(arg.name());
		assertNotNull(arg.name());
	}
}
