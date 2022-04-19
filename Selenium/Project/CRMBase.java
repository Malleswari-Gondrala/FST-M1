package CRM;
import FSTSeleniumProject.FSTSelenium.*;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

public class CRMBase {

	WebDriver driver;
	CRMUtilities utilities;
	CRMHomePage homePage;
	CRMLeadsPage leadsPage;
	Wait<WebDriver>  wait;
	public final String url = "https://alchemy.hguy.co/crm/";
	
	
	
	@BeforeTest
	public void BeforeMethod()
	{
		utilities = new CRMUtilities();
		homePage = new CRMHomePage();
		leadsPage = new CRMLeadsPage();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0036GG744\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void AfterMethod()
	{
		driver.close();
	}
	
	public void NavigateToCRMHomePage()
	{
		// Login to CRM 
					utilities.LoginCRM(driver);
			
					// Wait for the Dashboard element to load
					wait = new FluentWait<WebDriver>(driver)
						       .withTimeout(Duration.ofSeconds(300L))
						       .pollingEvery(Duration.ofSeconds(5L))
						       .ignoring(NoSuchElementException.class);
					
					wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(homePage.dashboard));
	}
	
	
	
	
}
