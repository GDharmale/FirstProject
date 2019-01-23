package com.MouseHover.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {
	
public static void main(String[] args) {
	WebDriver wd=new FirefoxDriver();
	wd.manage().window().maximize();
	
	wd.get("https://www.carmax.com/");
	WebElement we=wd.findElement(By.linkText("CARS FOR SALE"));
	
	Actions act=new Actions(wd);
	act.moveToElement(we).build().perform();
	
	WebElement we1=wd.findElement(By.linkText("Why CarMax?"));
	act.moveToElement(we1).build().perform();
	//wd.close();
	
	

	
}
	 


}
