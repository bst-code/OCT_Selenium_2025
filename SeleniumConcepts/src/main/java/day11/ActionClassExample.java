package day11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.SeleniumGenerics;

public class ActionClassExample extends SeleniumGenerics
{
	
	public void moveToElementAndClick() throws InterruptedException 
	{
		Thread.sleep(2000);
//		WebElement buttonEle = driver.findElement(By.xpath("//div[text()='ACTION CLASS OPTIONS']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(buttonEle).perform();
//		
//		Thread.sleep(2000);
//		
//		WebElement frameLinkEle = driver.findElement(By.id("bst_frames"));
//		act.moveToElement(frameLinkEle).click().build().perform();
		
		WebElement buttonEle = driver.findElement(By.xpath("//div[text()='ACTION CLASS OPTIONS']"));
		WebElement frameLinkEle = driver.findElement(By.id("bst_frames"));
		Actions act = new Actions(driver);
		act.moveToElement(buttonEle).moveToElement(frameLinkEle).click().build().perform();
	}
	
	public void doubleClickElement() 
	{
		WebElement doubleClickButton = driver.findElement(By.id("bst_btn"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleClickButton).perform();
		
		//act.dragAndDrop(src, target).perform();
	}
	
	public void rightClickAndSelect() throws AWTException, InterruptedException
	{
		WebElement ele = driver.findElement(By.name("right_click"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).contextClick().build().perform();
		
		Robot rt = new Robot();
		
		for(int i =0; i<3; i++)
		{
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		}
		
//		rt.keyPress(KeyEvent.VK_DOWN);
//		rt.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		
//		rt.keyPress(KeyEvent.VK_DOWN);
//		rt.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ActionClassExample obj = new ActionClassExample();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/actionclass");
		//obj.moveToElementAndClick();
		//obj.doubleClickElement();
		obj.rightClickAndSelect();
		obj.closeBrowser(obj.driver);
	}

}
