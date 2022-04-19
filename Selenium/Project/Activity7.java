package CRM;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;


public class Activity7 extends CRMBase{
	
	@Test
	public void readAdditionalInformation() throws InterruptedException{
					
		NavigateToCRMHomePage();
			
	
		// Find Activities Menu			
		WebElement salesMenu = driver.findElement(homePage.salesMenu);
		wait.until(ExpectedConditions.visibilityOf(salesMenu));
		
		// Click Sales and Find Leads
		salesMenu.click();
		
		// Click leads
		driver.findElement(homePage.leads).click();
		
	    
		// Wait until Leads table is loaded
		// WebElement lTable = driver.findElement(leadsPage.leadsTable);
		// wait.until(ExpectedConditions.visibilityOf(lTable));
		// wait.until(waitForJSToLoad());
		do
		{
			
		continue;
		}while(!waitForJSToLoad());
		
		// Find Additional Info icon and click it
		WebElement additionalInfo = driver.findElement(leadsPage.additionalDetailsInTable);
		wait.until(ExpectedConditions.visibilityOf(additionalInfo));
		
		Thread.sleep(4000);
		additionalInfo.click();
		
		// Read the mobile information
		WebElement mobileNumber = driver.findElement(leadsPage.mobileNumber);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(leadsPage.mobileNumber));
		System.out.println("The mobile number is " + mobileNumber.getText());
		Thread.sleep(5000);

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
