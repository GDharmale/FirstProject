package Cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CookieRead {
	public static void main(String[] args) {
		//WebDriver driver;	
        //System.setProperty("webdriver.chrome.driver","G:\\EXE Files\\chromedriver.exe");					
		WebDriver driver=new FirefoxDriver();        
		
		System.out.println("Step1:Navigate to the Site");
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");

       				
        // Input Email id and Password If you are already Register
		WebElement email=driver.findElement(By.xpath(".//input[@type='text']"));
		email.sendKeys("123abc");
		
		WebElement password=driver.findElement(By.xpath(".//input[@type='password']"));
		password.sendKeys("123xyz");
		
		WebElement Button=driver.findElement(By.xpath("html/body/div[2]/form/button"));
		Button.click();
        		
        // create file named Cookies to store Login Information		
        File file = new File("Cookies.data");							
        try		
        {	  
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		
            	
            // loop for getting the cookie information 		
            for(Cookie ck : driver.manage().getCookies())							
            {			
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();  
                System.out.println(ck.getName());
                /*System.out.println(ck.getDomain());
                System.out.println(ck.getValue());*/
                
            }			
            Bwrite.close();			
            fileWrite.close();	
            
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
    }		
	}


