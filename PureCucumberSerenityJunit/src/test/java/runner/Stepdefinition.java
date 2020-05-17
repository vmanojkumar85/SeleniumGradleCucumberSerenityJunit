package runner;

import static org.junit.Assert.assertEquals;

import endusersteps.enduser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import webactions.Webactions;

public class Stepdefinition extends PageObject {
	
	Webactions web;

    @Steps
    enduser user;
    
    @Managed(driver = "chrome")
    
	String URL="https://www.webdriveruniversity.com";
    String URLL="http://leafground.com/pages/download.html";
	
    @Given("open the web browser")
    public void open_the_web_browser() {
    	System.out.println("Chrome  is launched");
    }

    @Given("launch the WebDriverUniversity homepage")
    public void launch_the_WebDriverUniversity_homepage() {
    	getDriver().get(URL);
    	System.out.println("title of page :"+getDriver().getTitle());
    	//Verify.verify(getDriver().getTitle()=="WebDriverUniversity.com", "There is a slight mismatch in homepage's title");
    }

    @When("click on contact us link in WebDriverUniversity.com")
    public void click_on_contact_us_link_in_WebDriverUniversity_com() {
    
    	user.webdriverhomepage_click("CONTACT US");
    	web.switchWindows("WebDriver | Contact Us");
  
    }

    @Then("WebDriver contact us page should getlaunched")
    public void webdriver_contact_us_page_should_getlaunched() {
    	
    	System.out.println("title of page :"+getDriver().getTitle());
    	assertEquals("WebDriver | Contact Us", getDriver().getTitle());
    }

    @And("launch the download page")
    public void download() throws InterruptedException
    {
    	getDriver().get(URLL);
    	user.download("totalDownload");
    }
}
