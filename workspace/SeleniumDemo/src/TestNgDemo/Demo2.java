package TestNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	public String baseUrl="http://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	
	@AfterTest
	public void TerminateBrowser(){
		driver.close();
		
	}
	
	
	@Test
	public void veriftHomePageTitle(){
		String expectedTitle="Welcome: Mercury Tours";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedTitle);
	}
	

	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("Launch Browser");
		driver=new FirefoxDriver();
		driver.get(baseUrl);
		
	}
}
