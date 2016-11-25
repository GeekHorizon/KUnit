package org.geekhorizon.kunit;

public class Assert {
	
	public static void assertTrue(boolean t) {
		if (false == t) {
			throw new RuntimeException();
		}
	}
}
