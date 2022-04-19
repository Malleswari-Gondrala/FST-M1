package CRM;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;


public class Activity8 extends CRMBase{
	
	@Test
	public void readAdditionalInformation() throws InterruptedException{
					
		NavigateToCRMHomePage();
			
		// Click Sales Menu
		utilities.FindMenuOnHomePage(driver, "Sales").click();
		
		// Click Accounts
		driver.findElement(homePage.leads).click();

		Thread.sleep(5000);
		
		WebElement accountsTable = driver.findElement(leadsPage.leadsTable);
		
		List<WebElement> totalRows = accountsTable.findElements(By.xpath("tbody/tr"));
		System.out.println("Total Length of table is " + totalRows.size());
		
		List<WebElement> oddRows = accountsTable.findElements(By.xpath("tbody/tr[position() mod 2 =1]"));
		
		for(WebElement ele:oddRows)
		{
			WebElement name = ele.findElement(By.xpath("td[@type='name']"));
			System.out.println("UserName is " + name.getText());
		}

	}
	
	public  boolean waitForJSToLoad() {
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		// wait for Javascript to load
	    ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
	      @Override
	      public Boolean apply(WebDriver driver) {
	        return ((JavascriptExecutor)driver).executeScript("return document.readyState")
	        .toString().equals("complete");
	      }
	    };
		
	    return wait.until(jsLoad);
	}
}
