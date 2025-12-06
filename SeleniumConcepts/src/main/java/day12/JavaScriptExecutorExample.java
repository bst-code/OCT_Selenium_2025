package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import common.SeleniumGenerics;

public class JavaScriptExecutorExample extends SeleniumGenerics{


	public void ScrollToElementAndHighlight() throws InterruptedException 
	{
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

		//scroll to element
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", next);

		//to highlight 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 5px solid red;');", next);

		js.executeScript("arguments[0].setAttribute('id', 'bst;');", next);

		
		System.out.println(next.getText());


		//Thread.sleep(5000);
		
		//next.click();
		
		// For clicking the element using JS
		js.executeScript("arguments[0].click();", next);
		

	}


	public static void main(String[] args) throws InterruptedException {

		JavaScriptExecutorExample obj = new JavaScriptExecutorExample();
		obj.openBrowser("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo%2Cash%2Cank%2Cedy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts&page=1");
		obj.ScrollToElementAndHighlight();
	}

	// Sendkeys in JS
	//Webelement inputField = driver.findElement(By.id('gbqfq'));
	//js.executeScript("arguments[0].setAttribute('value', 'Balamurugan')", inputField);

}


























