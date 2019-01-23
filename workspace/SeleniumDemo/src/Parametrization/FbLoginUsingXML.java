package Parametrization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbLoginUsingXML {

	WebDriver driver;

	@Test
	@Parameters({ "username", "password" })
	public void Fblogin(String username, String password) {
		
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println("1");
		driver.manage().window().maximize();
	
		//driver.manage().deleteAllCookies();

		WebElement we=driver.findElement(By.id("email"));
		we.clear();
		we.sendKeys(username);
System.out.println("2");
		WebElement us=driver.findElement(By.id("pass"));
		us.clear();
		us.sendKeys(password);
		System.out.println("3");

		driver.findElement(By.id("u_0_2")).click();

	}

}
