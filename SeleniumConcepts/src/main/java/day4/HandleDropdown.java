package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public WebDriver driver =null;

	public void openBrowser(String url)
	{
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get(url); // wait until the page is loaded
	}

	
	public void selectDropdownValue() 
	{
		WebElement dropdownEle = driver.findElement(By.id("bst_select1"));
		
		Select st = new Select(dropdownEle);
		//st.selectByIndex(2);
		//st.selectByValue("3");
		//st.selectByVisibleText("LOADRUNNER");
		//st.selectByContainsVisibleText("RUNNER");
		
		String defaultValueSelected = st.getFirstSelectedOption().getText();
		System.out.println(defaultValueSelected);
		
		
	}
	
	public static void main(String[] args) {
		HandleDropdown obj = new HandleDropdown();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/dropdown");
		obj.selectDropdownValue();
	}
}
