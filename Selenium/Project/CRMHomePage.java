package FSTSeleniumProject.FSTSelenium;

import org.openqa.selenium.*;

public class CRMHomePage {
	
	public By dashboard = By.xpath("//div[@class='dashboard']");
	public By navigationMenu = By.xpath("//ul[@class='nav navbar-nav']");
	public By activitiesMenu = By.xpath("//ul[@class='nav navbar-nav']/li//a[text()='Activities']");
	public By salesMenu = By.xpath("//li[@class='topnav']//span/a[text()='Sales']");
	public By leads = By.xpath("//*[@id='moduleTab_9_Leads']");
	public By accounts_Sales = By.xpath("//*[@id='moduleTab_9_Accounts']");
}
