package day6;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.SeleniumGenerics;

public class DropDownOptions extends SeleniumGenerics
{
	
	public void getAllOptions() 
	{
		 List<WebElement> allEles =	 driver.findElements(By.tagName("option"));
		 System.out.println(allEles.size());
		 for (WebElement ele : allEles)
		 {
			System.out.println(ele.getText());
		 }		 
	}
	
	
	public void getDropdownValuesFromSpecific() 
	{
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("SELECT TRAINING PROGRAM");
		expectedList.add("SELENIUM");
		expectedList.add("APPIUM");
		expectedList.add("UFT/QTP");
		expectedList.add("LOADRUNNER");
		
		List<String> actualList = new ArrayList<String>();
		
		WebElement dropdownEle = driver.findElement(By.id("bst_select1"));
		Select st = new Select(dropdownEle);
		List<WebElement> optionEles=  st.getOptions(); // actual Data - Webelement
		
		//driver.findElements(By.xpath("//select[@id='month']/option"));
		for (WebElement ele : optionEles)
		{
			actualList.add(ele.getText());		
		}
		
		System.out.println("expectedList --> "+expectedList);
		System.out.println("actualList -->"+actualList);
		
		if(expectedList.equals(actualList))
		{
			System.out.println("Passed");
		}else
		{
			System.out.println("Failed");
		}
	}
	
	public static void main(String[] args) {
		DropDownOptions obj = new DropDownOptions();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/dropdown");
		//obj.getAllOptions();
		obj.getDropdownValuesFromSpecific();
	}

}
