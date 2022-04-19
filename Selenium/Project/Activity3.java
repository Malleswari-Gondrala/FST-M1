package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity3 extends CRMBase {
	
	@Test
	public void getCopyRightText() {
		WebElement bottomText = driver.findElement(utilities.getFooter());
		System.out.println(bottomText.findElement(By.cssSelector("a:first-child")).getText());
	}
}
