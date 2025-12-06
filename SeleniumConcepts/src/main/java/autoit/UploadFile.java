package autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import common.SeleniumGenerics;


public class UploadFile  extends SeleniumGenerics{

	
	
	public void uploadFileToConvert() throws  Exception 
	{
		WebElement ele = driver.findElement(By.xpath("//span[text()='Choose Files']"));
		ele.click();

		// To call Autoit Exe file 
		Runtime.getRuntime().exec("./src/main/java/autoit/uploadcode.exe"); //9sec
		
		Thread.sleep(15000);
		
	}
	
	public static void main(String[] args) throws Exception {
		UploadFile obj = new UploadFile();
		obj.openBrowser ("https://smallpdf.com/jpg-to-pdf");
		obj.uploadFileToConvert();
	}
}
