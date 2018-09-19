package stepDefinition;


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {
	public WebDriver driver;
	@Given("^user launches the browser$")
	public void user_launches_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  
	}

	@When("^user navigates to google homepage$")
	public void user_navigates_to_google_homepage() throws Throwable {
		driver.get("https://www.google.com/");
	    
	}

	@Then("^title is Google\\.$")
	public void title_is_Google() throws Throwable {
		String aTitle = driver.getTitle();
		String eTitle = "Google";
		Assert.assertEquals(eTitle, aTitle);
		
		
	 
	}



}
