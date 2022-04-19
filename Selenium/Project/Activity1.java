package CRM;

import org.testng.Assert;
import org.testng.annotations.*;


public class Activity1 extends CRMBase{
	
	@Test
	public void verifyTitle()
	{
		String expectedTitle = "SuiteCRM";
		Assert.assertEquals(expectedTitle, driver.getTitle());
	}
}
