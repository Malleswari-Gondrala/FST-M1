package CRM;


import org.openqa.selenium.support.Color;
import org.testng.annotations.*;


public class Activity5 extends CRMBase{
	
	
	@Test
	public void getNavigationMenuColor(){
		
		try {
			
			NavigateToCRMHomePage();
			
				// Find Navigation Menu
			String colorRGB = driver.findElement(homePage.navigationMenu).getCssValue("color");
			System.out.println("The color of navigation menu is " + Color.fromString(colorRGB).getColor());
		}
		catch(Exception ex)
		{
			System.out.println("Home Page not loaded" +ex.getMessage());
		}
	}
}
