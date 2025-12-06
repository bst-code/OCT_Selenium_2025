package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserCommands {
	
	
	public void openBrowser() throws InterruptedException 
	{
		//Interfacename objname = new Classname();
		WebDriver driver = new ChromeDriver(); // Open browser command 
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		
		driver.get("https://bsparksoftwaretechnologies.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();
		
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		BrowserCommands obj = new BrowserCommands();
		obj.openBrowser();
	}

}
