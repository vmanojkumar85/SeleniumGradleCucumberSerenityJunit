package pages;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

public class WebdriverLoginPortal_Page extends PageObject{

	public static HashMap<String, String> pageMap;

	static
	{
	pageMap =new HashMap<String, String>();
	pageMap.put("Username", "//input[@placeholder='Username']");
	pageMap.put("Password", "//input[@placeholder='Password']");
	pageMap.put("Login", "//button[@type='submit']");
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
