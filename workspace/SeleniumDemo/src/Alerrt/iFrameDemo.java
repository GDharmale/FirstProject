package Alerrt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class iFrameDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println("The Total Numbers Of Frames are:"+size);
		
		/*List<WebElement> iframeElements=driver.findElements(By.tagName("iframe"));
		System.out.println("The Total No Of Frames are:"+iframeElements.size());
		*/
		 /*JavascriptExecutor exe=(JavascriptExecutor)driver;
		 Integer noOfFrames=Integer.parseInt(exe.executeScript("return window.length").toString());
		 System.out.println("The No Of Frames are:"+noOfFrames);*/
		 
		 
		 
		 for(int i=0; i<=size; i++){
			 driver.switchTo().frame(i);
			 int total=driver.findElements(By.tagName("html/body/a/img")).size();
			 System.out.println(total);
			 driver.switchTo().parentFrame();
			 
		 }
		 
	}

}
