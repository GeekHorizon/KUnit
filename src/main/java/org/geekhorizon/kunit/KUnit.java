package org.geekhorizon.kunit;

import java.lang.reflect.Method;

public class KUnit {

	public static TestUnit wasRun(Object destination, String methodName) throws NoSuchMethodException, SecurityException {
		Method method = destination.getClass().getMethod(methodName);
		return new TestUnit(destination, method);
	}

}
