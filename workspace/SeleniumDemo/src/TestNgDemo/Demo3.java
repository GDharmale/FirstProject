package TestNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {
	
	WebDriver driver;
	public String baseUrl="http://google.co.in/";
	/*String actualTitle="google.co.in/";
	String expectedTitle=driver.getTitle();*/
	
	@Test
	public void verifyHomePageTitle(){
		driver=new FirefoxDriver();
		driver.get(baseUrl);
		Assert.assertEquals("Gooogle", driver.getTitle(),"Title not matching");
		
		
	}

}
