package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.SeleniumGenerics;

public class ElementSize extends SeleniumGenerics
{

	public void getSizeOfElement() 
	{
		WebElement ele = driver.findElement(By.id("bst_btn1"));
		System.out.println(ele.getSize().getHeight());
		System.out.println(ele.getSize().getWidth());
		
		System.out.println(ele.getRect().getHeight());
		System.out.println(ele.getRect().getWidth());
		System.out.println(ele.getRect().getX());
		System.out.println(ele.getRect().getY());
	}
	
	public static void main(String[] args) {
		
		ElementSize obj = new ElementSize();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/buttons");
		obj.getSizeOfElement();
	}

}
