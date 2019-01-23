package ListenetDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenetDemo.ListenerTest.class)

public class TestCases {
	
	WebDriver driver=new FirefoxDriver();
	
	@Test
	public void login(){
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys("mngr34926");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("amUpenu");
		
	}
	
	@Test
	public void testFail(){
		System.out.println("The is going to Fail");
		Assert.assertTrue(false);
	}

}
