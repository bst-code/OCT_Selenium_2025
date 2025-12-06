package common;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumGenerics {


	public WebDriver driver =null;

	public void openBrowser(String url)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(url); // wait until the page is loaded
	}

	public void openBrowser(String browser,String url)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();

		}else if (browser.equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();

		}else if (browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}else 
		{
			System.out.println("Please provide only supported browser like chrome,ie and egde...");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url); // wait until the page is loaded
	}

	public void closeBrowser(WebDriver driver) 
	{
		driver.close();
		System.out.println("Browser is closed");
	}

	public void refreshBrowser(WebDriver driver) 
	{
		driver.navigate().refresh();
	}

	public String getBrowserTitle(WebDriver driver) 
	{
		String title = driver.getTitle();
		System.out.println("Actual Title is "+ title);
		return title;
	}

	public void enterText(WebElement ele, String textToEnter) 
	{
		ele.sendKeys(textToEnter);
		System.out.println("Value entered in inputbox is "+ textToEnter);
	}

	public void clearText(WebElement ele) 
	{
		ele.clear();
		System.out.println("Inputbox value cleared..");
	}

	public void clickElement(WebElement ele) 
	{
		ele.click();
		System.out.println("Element is clicked");
	}

	public void selectDropDownByIndex(WebElement ele, int index) 
	{
		Select st = new Select(ele);
		st.selectByIndex(index);
		System.out.println("Dropdown value selected at index is "+ index);
	}

	public String getElementText(WebElement ele) 
	{
		String value = ele.getText();
		System.out.println("Actual Value from element is "+ value);
		return value;
	}

	// Step 1 : Download common IO jar - https://mvnrepository.com/artifact/commons-io/commons-io/2.19.0
	// Step 2:  Click Maven
	// Step 3 : Copy dependency and paste in POM.xml file
	public void takeScreenShot(WebDriver driver, String screeshotName) throws Exception 
	{	
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the  screenshot to desired location using copyFile method from common io jar
		FileUtils.copyFile(src, new File("./Screenshot/"+screeshotName+".png"));	 
	}

	public void takeElementScreenshot(WebElement ele,String screeshotName) throws Exception
	{
		File src= ele.getScreenshotAs(OutputType.FILE);
		// now copy the  screenshot to desired location using copyFile method from common io jar
		FileUtils.copyFile(src, new File("./Screenshot/"+screeshotName+".png"));
	}


}
