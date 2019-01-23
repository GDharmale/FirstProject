package TestNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  public String baseUrl="http://demo.guru99.com/test/newtours/"; 
  
 public WebDriver driver;
 @Test
 public void verifyHomePageTitle(){
	 System.out.println("Launching a firefox Browser ");
	 driver=new FirefoxDriver();
	 driver.get(baseUrl);
	 String exceptedTitle="Welcome: Mercury Tours";
	 String actualTitle=driver.getTitle();
	 Assert.assertEquals(actualTitle, exceptedTitle);
 }
}
