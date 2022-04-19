package CRM;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity2 extends CRMBase {
	
	@Test
	public void getHeaderURL() throws InterruptedException {
		
	WebElement header = driver.findElement(utilities.getHeader());
	System.out.println(header.getAttribute("src"));
		
	}	
}
