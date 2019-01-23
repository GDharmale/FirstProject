package Pratic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1 {
	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();

		wd.manage().window().maximize();

		System.out.println("Load The current Url");
		wd.get("www.google.com");

		System.out.println("Get The Current Page UrL");
		String s1 = wd.getCurrentUrl();
		System.out.println(s1);

		System.out.println("Get the Page Title");
		String s2 = wd.getTitle();
		System.out.println(s2);

		
		System.out.println("Detect the Email Field");
		WebElement email=wd.findElement(By.id(""));
		email.clear();
		email.sendKeys("Gauravdharmale");
		
		
		System.out.println("Detect the Password Field");
		WebElement pwd=wd.findElement(By.id(""));
		     pwd.sendKeys("12345");
		     
		     
		     
				
	}
	}
