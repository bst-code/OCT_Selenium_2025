package day9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.SeleniumGenerics;

public class WindowHandle  extends SeleniumGenerics
{

	public void switchToChildWindow() {

		String parentWindowSessionID= driver.getWindowHandle();
		System.out.println(parentWindowSessionID);

		WebElement ele = driver.findElement(By.id("bst_btn4"));
		ele.click();

		Set<String> allWindowSessionID =	driver.getWindowHandles();
		System.out.println(allWindowSessionID);
		
		for (String winSessionID : allWindowSessionID) 
		{
			if(!winSessionID.equals(parentWindowSessionID))
			{
				driver.switchTo().window(winSessionID);
			}
		}
		
		System.out.println(driver.getCurrentUrl()); //Interact with child window
		
		driver.close();
		//driver.quit(); // it kills webdriver session = null
		System.out.println(driver);
		
		driver.switchTo().window(parentWindowSessionID);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}
	
	public void switchToMultipleChildWindow() {

		String parentWindowSessionID= driver.getWindowHandle();
		System.out.println(parentWindowSessionID);

		WebElement ele = driver.findElement(By.id("bst_btn5"));
		ele.click();

		Set<String> allWindowSessionID =	driver.getWindowHandles();
		System.out.println(allWindowSessionID);
		
		for (String winSessionID : allWindowSessionID) 
		{
			if(!winSessionID.equals(parentWindowSessionID))
			{
				driver.switchTo().window(winSessionID);
				if(driver.getCurrentUrl().contains("manualtesting"))
				{
					break;
				}
			}
		}
		
		System.out.println(driver.getCurrentUrl());
		}
	
	public static void main(String[] args) {
		
		WindowHandle obj = new WindowHandle();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/windowhandle");
		//obj.switchToChildWindow();
		obj.switchToMultipleChildWindow();
	}

}
