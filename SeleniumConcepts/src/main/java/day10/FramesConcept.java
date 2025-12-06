package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.SeleniumGenerics;

public class FramesConcept extends SeleniumGenerics
{
	
	public void handleFrame() throws Exception 
	{
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("bst_frame1");
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@title='Button Frame']"));
		driver.switchTo().frame(frameEle);
				
		WebElement ele = driver.findElement(By.id("username"));
		
		ele.sendKeys("Bala");
		takeScreenShot(driver,"fullpage");
		takeElementScreenshot(ele, "elementScreenshot");
		
		driver.switchTo().defaultContent();
		
		WebElement dropdownEle = driver.findElement(By.xpath("//span[text()='DROPDOWN']"));
		//dropdownEle.click();
		
		//driver.switchTo().parentFrame();
	}
	
	public static void main(String[] args) throws Exception {
		
		FramesConcept obj = new FramesConcept();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/frames");
		obj.handleFrame();
		obj.closeBrowser(obj.driver);
	}

}
