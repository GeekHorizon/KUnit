package org.geekhorizon.kunit;

import java.util.LinkedList;
import java.util.List;

public class TestSuite {

	private List<TestCase> tests = new LinkedList<TestCase>();
	
	public void add(TestCase testCase) {
		tests.add(testCase);
	}

	public void run(TestResult r) {
		
		for (TestCase e : tests) {
			e.run(r);
		}
		
	}

}
