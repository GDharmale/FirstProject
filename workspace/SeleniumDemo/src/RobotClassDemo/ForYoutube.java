package RobotClassDemo;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.Action;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class ForYoutube {
	public static void main(String[] args) throws AWTException,InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		
		Actions act=new Actions(driver);
		driver.get("https://en.savefrom.net/#url=http://youtube.com/watch?v=YZtblbqaTw8&utm_source=youtube.com&utm_medium=short_domains&utm_campaign=ssyoutube.com");
	   driver.manage().window().maximize();
	   
	   act.sendKeys(Keys.PAGE_DOWN).build().perform();
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath(".//*[@id='sf_result']/div/div[1]/div[2]/div[2]/div[1]/a")).click();
	  
	   Robot robat=new Robot();
	   robat.keyPress(KeyEvent.VK_DOWN);
	   Thread.sleep(2000);
	   robat.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robat.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robat.keyPress(KeyEvent.VK_TAB);						
		Thread.sleep(2000);
		robat.keyPress(KeyEvent.VK_ENTER);
		
	   
	   
		
		
	}

}
