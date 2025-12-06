package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import common.SeleniumGenerics;

public class ElementConditions extends SeleniumGenerics
{


	public void checkIfElementIsSelected() 
	{
		WebElement checkBox = driver.findElement(By.id("bst_check6"));

		if(checkBox.isSelected())
		{
			System.out.println("Element is already Selected");
		}else 
		{
			checkBox.click();
		}
	}
	
	public void checkIfElementIsEnabled() 
	{
		driver.navigate().to("https://playground.bsparksoftwaretechnologies.com/send_keys");
		WebElement ele = driver.findElement(By.id("disabled"));
		
		if(ele.isEnabled())
		{
			ele.sendKeys("Bala");
		}else 
		{
			System.out.println("Please check the element is disbled....");
		}
	}
	
	public void checkIfElementIsDisplayed() 
	{
		driver.navigate().to("https://playground.bsparksoftwaretechnologies.com/send_keys");
		
		try {
		WebElement ele = driver.findElement(By.id("email"));
		
		if(ele.isDisplayed())
		{
			ele.sendKeys("Bala");
		}
		}catch (NoSuchElementException e) 
		{
			System.out.println("Element not displayed in UI");
		}
	}
	public static void main(String[] args) {
		ElementConditions obj = new ElementConditions();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/checkbox");
		//obj.checkIfElementIsSelected();
		//obj.checkIfElementIsEnabled();
		obj.checkIfElementIsDisplayed();
	}
}
