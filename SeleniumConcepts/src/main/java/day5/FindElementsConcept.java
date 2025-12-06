package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.SeleniumGenerics;

public class FindElementsConcept extends SeleniumGenerics{

	
	public void aboutLinkActions()
	{
		WebElement aboutEle = driver.findElement(By.linkText("About"));
		String actualText = aboutEle.getText();
		String actualURL = aboutEle.getAttribute("href");
		
		System.out.println(actualText);
		System.out.println(actualURL);
		aboutEle.click();
		
	}
	
	public void getAllLinksFromGooglePage() 
	{
	// WebElement link =	driver.findElement(By.tagName("a"));
	 List<WebElement> allEles =	 driver.findElements(By.tagName("a"));
	 System.out.println(allEles.size());
	 for (WebElement ele : allEles)
	 {
		System.out.println(ele.getText());
		System.out.println(ele.getAttribute("href"));
	 }
	}
	
	public static void main(String[] args) {
		FindElementsConcept obj = new FindElementsConcept();
		obj.openBrowser("https://www.google.com/");
		obj.getAllLinksFromGooglePage();
	}
}
