package com.MouseHover.prog;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShotDemo {
	public static void main(String[] args)throws Exception {
		//System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		Utlity.CaptureScreenShot(driver, "BrowserLoaded");
		
		driver.manage().window().maximize();
		
		driver.get("file:///G:/Selenium%20Softwares/Selenium%20Software/Offline%20Website/index.html");
		 Utlity.CaptureScreenShot(driver, "AfterLoadPage");
		
		WebElement email=driver.findElement(By.xpath(".//input[@id='email']"));
		email.sendKeys("kiran@gmail.com");
		Utlity.CaptureScreenShot(driver, "After Email Entered");
		
		
		WebElement pwd=driver.findElement(By.xpath(".//input[@id='password']"));
		pwd.sendKeys("123456");
		Utlity.CaptureScreenShot(driver, "After Password Entered");
		
		WebElement BTN=driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		BTN.click();
		Utlity.CaptureScreenShot(driver, "After Click");
	}

}
