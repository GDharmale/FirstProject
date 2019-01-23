package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndemo2 {
	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		
		wd.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement country=wd.findElement(By.name("country"));
		Select cot=new Select(country);
		cot.selectByValue("COLOMBIA");
		wd.close();
		
		
	}

}
