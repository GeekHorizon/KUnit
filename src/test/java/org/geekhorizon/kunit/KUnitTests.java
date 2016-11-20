package org.geekhorizon.kunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class KUnitTests {

	@Test
	public void testCallTestMethod() throws NoSuchMethodException, SecurityException {
		TestUnit testUnit = KUnit.wasRun(this, "testMethod");
		testUnit.run();
		assertTrue(testUnit.excecute);
	}

	public void testMethod() {
		
	}
	
}
