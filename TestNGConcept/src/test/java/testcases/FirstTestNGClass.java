package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass extends TestNGBaseClass{


	//@Test(priority = 1, dependsOnMethods = {"secondTestcase"})
	@Test
	public void firstTestcase()
	{
		System.out.println("Testcase 1 executed");
		Reporter.log("Testcase 1 executed");
	}

	@Test()
	public void secondTestcase()
	{
		System.out.println("Testcase 2 executed");
		Reporter.log("Testcase 2 executed");
	}

	//@Test(enabled = true, priority = 2)
	@Test
	public void thirdTestcase()
	{
		System.out.println("Testcase 3 executed");
		Reporter.log("Testcase 3 executed");

	}


}

