package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		Result result = JUnitCore.runClasses(SuiteDeTestes.class);		

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

		long endTime = System.currentTimeMillis();
		long total = endTime - startTime;
		System.out.println(total);
	}

}