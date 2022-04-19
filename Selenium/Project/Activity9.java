package CRM;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;


public class Activity9 extends CRMBase{
	
	WebElement accountsList;
	@Test
	public void fetchNameAndUser() {
					
		NavigateToCRMHomePage();
			
		// Click Sales Menu
		utilities.FindMenuOnHomePage(driver, "Sales").click();
		
		// Click Leads
		driver.findElement(homePage.leads).click();

		WaitForLeadsToLoad();		
		
		// Get the rows of the table
		List<WebElement> rows = getAllLeads(10);
		
		// Print the data to console
		for(WebElement ele:rows)
		{
			WebElement name = ele.findElement(By.xpath("td[@type='name']"));
			WebElement assignedTo = ele.findElement(By.xpath("td[@field=\"assigned_user_name\"]"));
			System.out.println("UserName is " + name.getText() + "And assigned to " + assignedTo.getText() );
		}

	}
	
	public void WaitForLeadsToLoad()
	{
		WebDriverWait waiter = new WebDriverWait(driver,Duration.ofSeconds(5));
		accountsList = waiter.until(ExpectedConditions.visibilityOfElementLocated(leadsPage.accountsTable));
	}
	
	public List<WebElement> getAllLeads(int count)
	{		
		WebElement leadsTable = driver.findElement(leadsPage.leadsTable);
		
		List<WebElement> totalRows = leadsTable.findElements(By.xpath("tbody/tr"));
		System.out.println("Total Length of table is " + totalRows.size());
		
		List<WebElement> rows = leadsTable.findElements(By.xpath("tbody/tr[position() < " + (count+1) + "]"));
		
		return rows;
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
