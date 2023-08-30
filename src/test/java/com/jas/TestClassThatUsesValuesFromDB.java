package com.jas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

public class TestClassThatUsesValuesFromDB {

	@Test
	public void testMockStaticValueFromDb() {
		// Mock the static methods in the class StaticDBValueHelper
		try (MockedStatic<StaticDBValueHelper> mocked = mockStatic(StaticDBValueHelper.class)) {

			// Set that when we send hello world,
			// we need to return "hello human" from the DB
			mocked.when(() -> StaticDBValueHelper.getValueFromDb("hello", "world")).thenReturn("welcome human");

			expectValuesInClass();
		}
	}

	private void expectValuesInClass() {

		ClassThatUsesValuesFromDB aClass = new ClassThatUsesValuesFromDB();

		// Initiate the required items
		aClass.initiateValues();

		// The result should be the reversed String
		// of whatever came from the DB
		assertEquals("namuh emoclew", aClass.getaValue());
	}
}
