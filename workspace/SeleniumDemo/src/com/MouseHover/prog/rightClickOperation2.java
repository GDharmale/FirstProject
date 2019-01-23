package com.MouseHover.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickOperation2 {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.javabykiran.com/");
		
		WebElement AboutSir=driver.findElement(By.xpath(".//*[@id='mobile-menu']/ul/li[2]/a"));
		
		Actions action=new Actions(driver);
		action.contextClick(AboutSir).perform();
	}

}
