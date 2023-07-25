package com.Simplilearn.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.EnumSource;

public class Demo11 {

	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	// explicit conversion
	public void test2(@ConvertWith(ArgumentConverter.class) String args) {
		assertNotNull(TimeUnit.valueOf(args));
	}
}
