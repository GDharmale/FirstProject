package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DROPDOWNDEMO {
	public static void main(String[] args) throws Exception {
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://www.facebook.com/");
		wd.manage().window().maximize();
		
		
		WebElement date=wd.findElement(By.id("day"));
		Select DD=new Select(date);
		DD.selectByIndex(5);
		
		WebElement month=wd.findElement(By.id("month"));
		Select MM=new Select(month);
		MM.selectByValue("4");
		
		WebElement year=wd.findElement(By.id("year"));
		Select YY=new Select(year);
		YY.selectByVisibleText("2014");
		
		
		//wd.close();
		
		
	}

}
