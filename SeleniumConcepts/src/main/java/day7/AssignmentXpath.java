package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.SeleniumGenerics;

public class AssignmentXpath extends SeleniumGenerics {
	
	public void register() 
	{
		WebElement customEle = driver.findElement(By.xpath("//input[@name='gender' and @value='-1']"));
		customEle.click();
		
		WebElement customDropdownEle = driver.findElement(By.xpath("//label[text()='Select your pronoun']/following-sibling::select"));
		Select st = new Select(customDropdownEle);
		List<WebElement> eles = st.getOptions();
		for (WebElement ele : eles) {
			
			System.out.println(ele.getText());
		}
		
		
		
	}

}
