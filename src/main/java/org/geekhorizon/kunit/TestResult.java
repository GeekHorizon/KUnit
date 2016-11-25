package org.geekhorizon.kunit;

public class TestResult {

	private int runCount = 0;
	private int failureCount = 0;
	
	public TestResult() {
		runCount = 0;
		failureCount = 0;
	}

	public String summary() {
		return runCount + " run, "+ failureCount + " failed";
	}

	public void testStarted() {
		runCount++;
	}

	public void testFailed() {
		failureCount++;		
	}
	
}
