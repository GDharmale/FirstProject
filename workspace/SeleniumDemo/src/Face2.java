import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Face2 {

public static void main(String[] args) {
	 WebDriver wd=new FirefoxDriver();
	 wd.get("https://www.facebook.com/");
	wd.navigate().refresh();
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement email=wd.findElement(By.xpath(".//input[@id='email']"));
	  Actions act=new Actions(wd);
	  Action seriesOfActions=act.moveToElement(email).click()
			  .keyDown(email,Keys.SHIFT).sendKeys(email,"hello")
			  .keyUp(email, Keys.SHIFT)
			  .doubleClick(email)
			  .contextClick().build();
	 
	  seriesOfActions.perform();
	  wd.close();
			  
}
}
