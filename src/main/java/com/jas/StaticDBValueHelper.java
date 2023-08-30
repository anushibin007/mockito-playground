package com.jas;

/**
 * This class is used to return static values as if they were read from a DB.F
 */
public class StaticDBValueHelper {
	/**
	 * This method is supposed to return a value from the DB. But we throw an
	 * IllegalStateException always since there is no connection to the DB. You are
	 * supposed to mock this method to be able to successfully execute it.
	 * 
	 * @param a does'nt matter what you give
	 * @param b does'nt matter what you give
	 * @return
	 */
	public static String getValueFromDb(String a, String b) {
		if (true) {
			throw new IllegalStateException("DB not accessible");
		}
		return "this value will never be returned";
	}
}
