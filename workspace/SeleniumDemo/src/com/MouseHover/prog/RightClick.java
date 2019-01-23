package com.MouseHover.prog;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\chromedriver.exe");
	WebDriver wd=new  ChromeDriver();
	wd.manage().window().maximize();
	
	Actions act=new Actions(wd);
	
	wd.get("http://javabykiran.com/");
	
	WebElement we=wd.findElement(By.linkText("About Sir"));
	act.doubleClick().perform();
	
}
}
