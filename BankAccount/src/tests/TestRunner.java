//Mike Smith
//CIS 175 - Maven Project



package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


//Test Runner to execute AllTests suite and output if all results passed in the console. 

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.print(result.wasSuccessful());

	}

}


