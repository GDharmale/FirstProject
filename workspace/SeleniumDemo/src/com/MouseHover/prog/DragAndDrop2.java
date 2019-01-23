package com.MouseHover.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop2 {
	public static void main(String...args) {
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		
		System.out.println("Navigate To the Site");
		 wd.get("http://jqueryui.com/droppable/");
		 
		 System.out.println("Create the object of Action Class");
		 Actions act=new Actions(wd);
		 
		 System.out.println("Wait Condition");
		 WebDriverWait wait=new WebDriverWait(wd, 10);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		 
		 System.out.println("To get Sourece Locator");
		 WebElement sourcelocator=wd.findElement(By.id("draggable"));
		
		 System.out.println("To get Target Locator");
		 WebElement Targetlocator=wd.findElement(By.id("droppable"));
		 
		 act.dragAndDrop(sourcelocator, Targetlocator).build().perform();
		 wd.close();
		 
		
		 
		 
		 
		
	}

}
