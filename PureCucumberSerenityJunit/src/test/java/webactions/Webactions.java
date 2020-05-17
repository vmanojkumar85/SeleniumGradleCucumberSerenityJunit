package webactions;

import java.util.HashMap;
import java.util.Set;

import net.thucydides.core.pages.PageObject;

public class Webactions extends PageObject {

	
	
	// method to switch between windows
	public void switchWindows(String title)
	{
		Set<String> windows=getDriver().getWindowHandles();
    	HashMap<String, String> window=new HashMap<String, String>();
    	for (String win : windows) 
    	{ 
    			window.put(getDriver().switchTo().window(win).getTitle(), win);
    	}
    	getDriver().switchTo().window(window.get(title));
    	System.out.println("the window which needs to open :"+title);
		}

}
	
