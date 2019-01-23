package com.MouseHover.prog;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot2 {
public static void main(String[] args) throws Exception {
	
	WebDriver wd= new FirefoxDriver();
	wd.get("http://facebook.com/");
	TakesScreenshot tsc=((TakesScreenshot)wd);
	File src=tsc.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./ScreenShot/scr_bmp_for.bmp"));
	wd.close();
	
	
}

}
