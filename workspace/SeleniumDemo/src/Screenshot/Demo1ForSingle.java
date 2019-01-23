package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Demo1ForSingle {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Samsung\\workspace\\SeleniumDemo\\ScreenShot2\\MyScreenshot.png"));
		driver.close();
		
	}

}
