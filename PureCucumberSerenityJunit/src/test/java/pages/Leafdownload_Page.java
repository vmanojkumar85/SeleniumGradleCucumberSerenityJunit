package pages;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

public class Leafdownload_Page extends PageObject {

	
	public static HashMap<String, String> pageMap;

	static
	{
	pageMap =new HashMap<String, String>();
	pageMap.put("totalDownload", "//div[@class='todo']/a");
	
	}
	
	public void clickOho(String key) throws InterruptedException
	{
		getDriver().findElement(By.xpath(pageMap.get(key))).click();
	
		Thread.sleep(4000);
	}
	public void downloadOperation(String key) throws InterruptedException
	{
		List<WebElement> elementsList=getDriver().findElements(By.xpath(pageMap.get(key)));
		for (WebElement webElement : elementsList) {
			System.out.println("The web element is -----"+webElement);
			Thread.sleep(3000);
		}
		File fileLocation =new File("C:\\Users\\manoj\\Downloads");
		File totalFiles[]= fileLocation.listFiles();
		System.out.println("-------------These are the total files--------------");
		for (File file : totalFiles) 
		{
			System.out.println(file.getName());
		}
		System.out.println("-----------------------------------------------------");

	}
}
