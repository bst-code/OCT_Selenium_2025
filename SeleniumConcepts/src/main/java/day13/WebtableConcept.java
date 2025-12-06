package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.SeleniumGenerics;

public class WebtableConcept extends SeleniumGenerics
{

	public void getAllData() 
	{
		int count = 0;
		
		WebElement tableEle = driver.findElement(By.xpath("//table[@id='webtable']/tbody"));

		List<WebElement> rows =	tableEle.findElements(By.tagName("tr"));
		for (WebElement row : rows){
			count = count +1;
			List<WebElement> cells =	row.findElements(By.tagName("td"));
			for (WebElement cell : cells) {
				
				String value = cell.getText();
				if(value.equals("ADMIN") || value.equals("TECH SUPPORT"))
				{
					WebElement checkBox = driver.findElement(By.xpath("(//input[@name='active'])["+count+"]"));
					checkBox.click();
				}
				System.out.print(value +" | ");
				
			}
			System.out.println();
		}

	}


	public static void main(String[] args) {
		WebtableConcept obj = new WebtableConcept();
		obj.openBrowser("https://playground.bsparksoftwaretechnologies.com/webtable");
		obj.getAllData();
	}
}
