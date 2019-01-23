package RobotClassDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailtest {

	public static void main(String args[]) throws AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.name("identifier")).sendKeys("gdharmale01@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.name("password")).sendKeys("8600155158");

		// Create object of Robot class
		Robot r = new Robot();

		// Press Enter
		r.keyPress(KeyEvent.VK_ENTER);

		// Release Enter
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}
