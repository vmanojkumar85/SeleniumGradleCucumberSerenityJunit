package endusersteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pages.Leafdownload_Page;
import pages.WebDriverUniversityHome_Page;
import pages.WebdriverLoginPortal_Page;

public class enduser {

  @Steps
    WebdriverLoginPortal_Page Webdriverloginpage;
  	WebDriverUniversityHome_Page WebdriveruniversityHomepage;
	Leafdownload_Page leafpage;
  	
  	//WebdriveruniversityHomepage methods
  	
  	@Step
  	public void webdriverhomepage_click(String key)
  	{
  		WebdriveruniversityHomepage.submit(key);
  	}
  	
  	//Webdriverloginpage methods
	
	@Step
	public void click(String key)
	{
		Webdriverloginpage.submit(key);
	}
	
	@Step
	public void insertValue(String key,String value)
	{
		Webdriverloginpage.sendValues(key, value);
	}
	
	@Step
	public void download(String key) throws InterruptedException
	{
		leafpage.downloadOperation(key);
	}
	
}
