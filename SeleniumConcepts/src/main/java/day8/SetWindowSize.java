package day8;

import org.openqa.selenium.Dimension;

import common.SeleniumGenerics;

public class SetWindowSize extends SeleniumGenerics
{
	
	public void windowSize() 
	{
		Dimension dim = new Dimension(250, 600);
		driver.manage().window().setSize(dim);
	}
	
	public static void main(String[] args) {
		SetWindowSize obj = new SetWindowSize();
		obj.openBrowser("https://bsparksoftwaretechnologies.com/");
		obj.windowSize();
	}

}
