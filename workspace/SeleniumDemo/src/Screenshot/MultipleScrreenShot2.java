package Screenshot;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.MouseHover.prog.Utlity;

public class MultipleScrreenShot2 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///G:/Selenium%20Softwares/Selenium%20Software/Offline%20Website/index.html");
		forMultiple.captureScreenShot(driver, "After Loading Page Sucessfully");
		
		WebElement email=driver.findElement(By.xpath(".//input[@id='email']"));
		email.sendKeys("kiran@gmail.com");
		forMultiple.captureScreenShot(driver, "After Enterning UserName");
	}

}
