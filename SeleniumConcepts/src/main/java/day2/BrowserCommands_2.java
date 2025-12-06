package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands_2 {

	public WebDriver driver =null;
	
	public void openBrowser(String url)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url); // wait until the page is loaded
	}
	
	public void closeBrowser() 
	{
		driver.close();
	}
	
	public void getCurrentURLAndTitleConcept() 
	{
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title of current browser is :: "+ actualTitle);
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		String actualSrc = driver.getPageSource();
		System.out.println(actualSrc);
		
		// will not wait until the page is loaded
		driver.navigate().to("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	
	
	}
	
	public static void main(String[] args) {
		
		BrowserCommands_2 obj = new BrowserCommands_2();
		obj.openBrowser("https://www.facebook.com/");
		
		obj.getCurrentURLAndTitleConcept();
		
		//obj.closeBrowser();
	}
}
