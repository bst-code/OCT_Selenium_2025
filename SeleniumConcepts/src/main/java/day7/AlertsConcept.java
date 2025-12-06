package day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.SeleniumGenerics;

public class AlertsConcept extends SeleniumGenerics
{

	public void acceptAlert() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//button[text()='HIT ME']"));
		ele.click();
		
		Thread.sleep(3000);

		Alert at = driver.switchTo().alert();

		String actualData = at.getText(); //to get the text from alert 
		System.out.println(actualData);

		if(actualData.equals("Bala"))
		{
			at.accept(); //oK
		}else 
		{
			System.out.println("Dont accept");
		}


		//at.dismiss(); //cancel

		//at.sendKeys("Bala"); //to type data

	}
	
	public static void main(String[] args) throws InterruptedException {
		AlertsConcept obj = new AlertsConcept();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/alert");
		obj.acceptAlert();
	}
}
