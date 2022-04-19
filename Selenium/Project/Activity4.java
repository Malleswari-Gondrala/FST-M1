package CRM;
import FSTSeleniumProject.FSTSelenium.*;
import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;


public class Activity4 extends CRMBase{
	

	
	@BeforeTest
	public void BeforeMethod()
	{
		super.BeforeMethod();
		homePage = new CRMHomePage();
	}
	
	@Test
	public void verifyHomePage(){
		
		try {
		// Login to CRM 
		utilities.LoginCRM(driver);

		// Wait for the Dashboard element to load
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(homePage.dashboard));
		
		}
		catch(Exception ex)
		{
			System.out.println("Home Page not loaded" +ex.getMessage());
		}
	}
}
