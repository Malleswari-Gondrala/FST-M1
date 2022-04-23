package Activities;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class Activity11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Click the button to open a simple alert
        driver.findElement(By.cssSelector("button#confirm")).click();

        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();

        //Get text in the alert box and print it
        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);

        //Close the alert with OK
        confirmAlert.accept();

        //Close the browser with Cancel
        //confirmAlert.dismiss();

        //Close the Browser
        driver.close();
    }
}