package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestNGBaseClass {

	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("Start time");
	}
	
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("End Time");
		System.out.println("Execution Time = end-start");
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Exuected before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Exuected after class");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Open browser");
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("Close browser");
	}
}
