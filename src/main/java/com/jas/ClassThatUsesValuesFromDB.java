package com.jas;

public class ClassThatUsesValuesFromDB {

	private String aValue;

	public String getaValue() {
		return aValue;
	}

	private void setaValue() {
		// You are supposed to get "welcome human" from the DB
		this.aValue = StaticDBValueHelper.getValueFromDb("hello", "world");

		// Reverse the string to show that external operations
		// can be done on the value that comes from the DB
		this.aValue = new StringBuilder(aValue).reverse().toString();
	}

	public void initiateValues() {
		// This call fails when you execute the main() method directly.
		// You are supposed to mock the StaticDBValueHelper.getValueFromDb()
		// method if you want this to be successful.
		this.setaValue();
		System.out.println("aClass.getaValue() -> " + this.getaValue());
	}

}
