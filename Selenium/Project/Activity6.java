package CRM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;


public class Activity6 extends CRMBase{
	
	@Test
	public void verifyActivitiesMenu(){
					
		NavigateToCRMHomePage();
			
	
		// Find Activities Menu			
		WebElement activitiesMenu = driver.findElement(homePage.activitiesMenu);
		wait.until(ExpectedConditions.visibilityOf(activitiesMenu));
		
		// Verify Activities Menu is present on the page
		Assert.assertNotNull(activitiesMenu, "Activities Menu found on the page");
		
	}
}
