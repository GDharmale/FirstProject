package com.MouseHover.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","G:\\EXE Files\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		
		
		wd.manage().window().maximize();
		
		Actions act=new Actions(wd);
		wd.get("http://javabykiran.com/");
		Thread.sleep(2000);
		
		//wd.navigate().refresh();
	
		

		
		//act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.F5).build().perform();
		
		/*JavascriptExecutor js=(JavascriptExecutor)wd;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("scroll(0,250)");	
		//js.executeScript("window.scrollBy(0,+250)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,-250)");
		//js.executeScript("window.scrollBy(0,-250)");
		
		//act.sendKeys(Keys.PAGE_UP).build().perform();
*/
}
}
