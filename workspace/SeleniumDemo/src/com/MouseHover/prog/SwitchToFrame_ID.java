package com.MouseHover.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToFrame_ID {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver(); //navigates to the Browser
	    driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID
	       Thread.sleep(3000);

			System.out.println("********We are switch to the iframe*******");
     		driver.findElement(By.xpath("html/body/a/img")).click();
     		Thread.sleep(3000);
  		    //Clicks the iframe
       
  			System.out.println("*********We are done***************");
  			driver.close();
      }
	}


