package autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.SeleniumGenerics;

public class GetElementSize extends SeleniumGenerics {
	
	
	public void getSizeOfElement() 
	{
		WebElement ele = driver.findElement(By.id("email"));
		System.out.println(ele.getRect().getHeight());
		System.out.println(ele.getRect().getWidth());
		
		System.out.println(ele.getRect().getX());
		System.out.println(ele.getRect().getY());
	}
	
	public static void main(String[] args) {
		GetElementSize obj = new GetElementSize();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/send_keys");
		obj.getSizeOfElement();
	}

}
