package org.geekhorizon.kunit;

import java.lang.reflect.Method;

public class TestCase {

	private String name;
	public TestCase(String name) {
		this.name = name;
	}

	public void setUp() {
	}
	
	public void run(TestResult r) {
		setUp();
		r.testStarted();
		try {
			Method method = this.getClass().getMethod(name);
			method.invoke(this);
		} catch (Exception e) {
			r.testFailed();
		}
		
		tearDown();
	}
	
	public void tearDown() {
	}
}
