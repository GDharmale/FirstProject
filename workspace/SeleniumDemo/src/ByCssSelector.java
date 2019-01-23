

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByCssSelector {
	public static void main(String[] args) {
		
	
	
	WebDriver driver;
	String baseUrl="https://www.facebook.com/";
	
	driver=new FirefoxDriver();
	driver.get(baseUrl);
	
	driver.findElement(By.cssSelector("input[id=email ] [class=inputtext][type=email]")).sendKeys("gauravdharmalw@101");
	

}
}