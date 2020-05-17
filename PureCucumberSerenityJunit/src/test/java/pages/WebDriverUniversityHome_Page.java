package pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

public class WebDriverUniversityHome_Page extends PageObject{

	
	public static HashMap<String, String> pageMap;

	static
	{
	pageMap =new HashMap<String, String>();
	pageMap.put("CONTACT US", "//h1[text()='CONTACT US']");
	pageMap.put("LOGIN PORTAL", "//h1[text()='LOGIN PORTAL']");
	}
	
	public void sendValues(String key,String value)
	{
		getDriver().findElement(By.xpath(pageMap.get(key))).clear();
		getDriver().findElement(By.xpath(pageMap.get(key))).sendKeys(value);
	}
	
	public void submit(String key)
	{
		getDriver().findElement(By.xpath(pageMap.get(key))).click();
	}
}
