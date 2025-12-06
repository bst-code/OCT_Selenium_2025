package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTestNGClass extends TestNGBaseClass {

	@Test
	public void fourthTestcase()
	{

		System.out.println("Testcase 4 executed");
		Reporter.log("Testcase 4 executed");

	}
}

