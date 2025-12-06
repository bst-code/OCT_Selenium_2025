package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.SeleniumGenerics;

public class WaitsInSelenium extends SeleniumGenerics
{
	public void ExplicitWait() 
	{
		WebElement ele = driver.findElement(By.id("show-element-btn"));
		ele.click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delayed-element-text")));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delayed-element-text")));
		
		WebElement textEle = driver.findElement(By.id("delayed-element-text"));
		System.out.println(textEle.getText());
	
	}
	
	public static void main(String[] args) {
		
		WaitsInSelenium obj = new WaitsInSelenium();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/wait");
		obj.ExplicitWait();
	}
}
