package com.MouseHover.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
public static void main(String[] args) throws Exception {
	
	String baseUrl = "http://demo.guru99.com/test/social-icon.html";	
	System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\chromedriver.exe");
	WebDriver wd=new  ChromeDriver();
	wd.manage().window().maximize();
	wd.get(baseUrl);					
    String expectedTooltip = "Github";	
    Thread.sleep(3000);
    
    // Find the Github icon at the top right of the header		
    WebElement github = wd.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));	
    Thread.sleep(3000);
    
    //get the value of the "title" attribute of the github icon		
    String actualTooltip = github.getAttribute("title");
    Thread.sleep(3000);
    
    //Assert the tooltip's value is as expected 		
    System.out.println("Actual Title of Tool Tip"+actualTooltip);							
    if(actualTooltip.equals(expectedTooltip)) {							
        System.out.println("Test Case Passed");					
    }		
  //wd.close();			
}		
}

