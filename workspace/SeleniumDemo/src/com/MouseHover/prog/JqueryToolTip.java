package com.MouseHover.prog;

import org.openqa.selenium.interactions.Action;		
import org.openqa.selenium.interactions.Actions;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		

public class JqueryToolTip {				
    public static void main(String[] args) throws Exception {									
     
        String baseUrl = "http://demo.guru99.com/test/tooltip.html";					
        System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\chromedriver.exe");	
        
        WebDriver driver = new ChromeDriver();					
        String expectedTooltip = "What's new in 3.2";					
        driver.get(baseUrl);					
        		
        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
        Actions builder = new Actions (driver);							

       // builder.clickAndHold().moveToElement(download);					
        builder.moveToElement(download).build().perform(); 
        Thread.sleep(3000);
        
        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
        String actualTooltip = toolTipElement.getText();			
        Thread.sleep(3000);
        System.out.println("Actual Title of Tool Tip  "+actualTooltip);	
        Thread.sleep(3000);	
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }	
        Thread.sleep(3000);
        //driver.close();			
   }		
}		
