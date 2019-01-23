package com.MouseHover.prog;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utlity {
	public static void CaptureScreenShot(WebDriver driver, String ScreenshotName) {
		
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File Source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File("./ScreenShot/"+ScreenshotName+".png"));
			System.out.println("ScreenShot Taken");
		} 
		catch (Exception e) {
			System.out.println("Exception While Taking ScreenShot"+e.getMessage());
		}
		
	}

}
