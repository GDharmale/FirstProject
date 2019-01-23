package com.MouseHover.prog;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		System.out.println("Step 1:Open the Given URL");
		wd.get("http://demo.guru99.com/test/delete_customer.php");
		
		//To Identify the Frames in the Web-Page use the following syntex.
	    List<WebElement> Fram=wd.findElements(By.tagName("iframe"));
	    Fram.size();
	    
	   
	    System.out.println("The Number Of Frames Present is:"+Fram);
	    

		System.out.println("Step 2:Locate the Element");
		WebElement CID = wd.findElement(By.xpath(".//input[@type='submit']"));
		CID.click();

		Alert al = wd.switchTo().alert();
		Thread.sleep(2000);
		al.accept();

		// Capturing the Alert Information
		System.out.println("Step 3:Getting the Information About the POPUP:");
		String Al = wd.switchTo().alert().getText();
		System.out.println(Al);

		System.out.println("Step 4:Handling the next POPUP Element");

		Alert al1 = wd.switchTo().alert();
		Thread.sleep(2000);
		al1.accept();
wd.quit();
	}
}
