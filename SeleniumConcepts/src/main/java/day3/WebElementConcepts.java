package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcepts {

	public WebDriver driver =null;

	public void openBrowser(String url)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url); // wait until the page is loaded
	}

	public void enterText() 
	{
		WebElement emailInput = driver.findElement(By.id("email"));
		String placeHolderText = emailInput.getAttribute("placeholder");
		System.out.println(placeHolderText);
		emailInput.sendKeys("Bala@bspark.com");
		emailInput.clear();
		emailInput.sendKeys("John@bspark.com");

		WebElement defaultTextEle = driver.findElement(By.name("bst_default"));
		String actualDefaultText = defaultTextEle.getAttribute("value");
		System.out.println(actualDefaultText);
	}

	
	public void clickConcept() 
	{
		driver.navigate().to("https://playground.bsparksoftwaretechnologies.com/buttons");
		
		WebElement buttonEle = driver.findElement(By.id("bst_btn1"));
		String actualText =buttonEle.getText();
		System.out.println(actualText);
		buttonEle.click();
	}
	public static void main(String[] args) {
		WebElementConcepts obj = new WebElementConcepts();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/send_keys");
		obj.enterText();
		obj.clickConcept();

	}
}
