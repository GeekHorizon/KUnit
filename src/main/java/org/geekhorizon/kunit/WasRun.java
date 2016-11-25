package org.geekhorizon.kunit;

public class WasRun extends TestCase {

	public boolean wasRun = false;
	public boolean wasSetup = false;
	public String log = "";
	
	public WasRun(String name) {
		super(name);
	}

	public void testMethod() {
		wasRun = true;	
		log += "testMethod "; 
	}
	
	@Override
	public void setUp() {
		wasRun = false;
		wasSetup = true;
		log = "SetUp ";
	}
	
	@Override
	public void tearDown() {
		log += "tearDown "; 
	}
	
	public void testBrokenMethod() {
		throw new RuntimeException();
	}
}
