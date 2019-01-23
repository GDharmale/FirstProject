package Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;





public class forMultiple {
	
		public static void captureScreenShot(WebDriver driver, String screenShotName){
			try {
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				File src=screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\Samsung\\workspace\\SeleniumDemo\\ScreenShot2"+screenShotName+".png"));
			System.out.println("ScreenShot Taken");
				
			} catch (Exception e) {
				System.out.println("Exception While Taking Screen Shot is:"+e.getMessage());
			}
			
		}
	}


