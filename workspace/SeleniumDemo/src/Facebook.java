
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class Facebook {
	
	

	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		
		wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);*/
		
		
		wd.get("https://www.facebook.com/");
		
		wd.manage().deleteAllCookies();
		//this is another method contains we can use to get a x-path.
		WebElement uid=wd.findElement(By.xpath("//input[@type='email' and @class='inputtext']"));
		uid.clear();
		uid.sendKeys("gauravdharmale@yahoo.com");
		
		//this is another attribute (type) we can use to get a x-path.
		WebElement pwd=wd.findElement(By.xpath("//input[@type='password' and @class='inputtext']"));
		pwd.clear();
		pwd.sendKeys("mydream");
		
		
		
		//this is another attribute class name we can use to get a x-path.
		WebElement btnclick=wd.findElement(By.xpath("*//input[@type='submit']"));
		btnclick.click();
	}

}
