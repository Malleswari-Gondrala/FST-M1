package FSTSeleniumProject.FSTSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;

public class CRMUtilities {
	
	String userName;
	String password;
	CRMLoginPage loginPage;
	CRMHomePage homePage;
	
	public CRMUtilities()
	{
		userName = "admin";
		password = "pa$$w0rd";
		loginPage = new CRMLoginPage();
		homePage = new CRMHomePage();
	}
	
	public void LoginCRM(WebDriver driver)
	{
		driver.findElement(loginPage.userName).sendKeys(this.userName);
		driver.findElement(loginPage.password).sendKeys(this.password);
		driver.findElement(loginPage.password).submit();
	}
		
	public By getHeader()
	{
		return loginPage.companyLogo;
	}
	
	public By getFooter()
	{
		return loginPage.copyRightText;
	}
	
	public WebElement FindMenuOnHomePage(WebDriver driver, String menuItem)
	{
		Wait<WebDriver> waiter = new WebDriverWait(driver, Duration.ofMillis(10000));
		By elementPath;
		switch(menuItem.toLowerCase())
		{
		case "sales" : elementPath = homePage.salesMenu;break;
		default : return null;
		}
		
		WebElement menu = driver.findElement(elementPath);
		waiter.until(ExpectedConditions.visibilityOf(menu));
		
		return menu;
	}
	
}
