package Pratic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToRefresh {
	public static void main(String[] args) throws InterruptedException {
		
	

	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	
	
	//driver.navigate().refresh();
	Actions action=new Actions(driver);
	action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();

	
	
}
}