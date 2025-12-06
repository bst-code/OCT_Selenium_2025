package day7;

public class IfConditions {

	
	String browser = "SAFARI";
	
	public void openBrowser() 
	{
		
		// Simple if else
		
		//if(browser.equals("Chrome"))
		//if(browser.equalsIgnoreCase("chrome"))
		if(browser.contains("CHROME"))
		{
			System.out.println("Chrome browser Opened");
		}
		
		else if(browser.equals("IE") || browser.equals("InternetExplorer"))
		{
			System.out.println("IE Browser opened");
		}
		
		else if(browser.equals("EDGE"))
		{
			System.out.println("EDGE Browser opened");
		}
		else if(browser.equals("SAFARI"))
		{
			System.out.println("SAFARI Browser opened");
		}
		else 
		{
			System.out.println("Please provide valid browser name");
		}
	}
	
	int age = 0;
	
	public void checkEligible() 
	{
		
		// AND && - check for all conditions 
		// OR  || - Check for any one condition
		if(age == 10)
		{
			System.out.println("My age is 10");
		}else if(age >= 18)
		{
			System.out.println("Eligbile for voting");
		}else if(age>=0 || age<18 || age < 20)  // 0 > - 18 <
		{
			System.out.println("Not Eligible");
		}else 
		{
			System.out.println("Please enter value between 0 to 100");
		}
			
	}
	
	// get the mark by parameter
	// Total mark < 40 - Failed
	// 41 to 60 - third class, 61 to 80 - second class, 81 to 100 - first class, Handle negative number
	
	public static void main(String[] args) {
		
		IfConditions obj = new IfConditions();
		//obj.openBrowser();
		obj.checkEligible();
	}
}
