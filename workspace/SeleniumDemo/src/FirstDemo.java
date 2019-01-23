import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.webkitRTCPeerConnection;

public class FirstDemo {
	public static void main(String[] args){
		System.out.println("Step 1:First Open the Browser");
		WebDriver wd = new FirefoxDriver();
		System.out.println("Step 2: Get The Address of Offline Page");

		wd.get("file:///C:/JBK%20Eclipse%20Configured%2064-bit/Lib%20JBK/Selenium%20Software/Offline%20Website/index.html");

		System.out.println("Step 3:Insept the email field");
		WebElement user = wd.findElement(By.xpath(".//*[@id='email']"));
		user.sendKeys("kiran@gmail.com");

		System.out.println("step4: Insepct the Password field");
		WebElement password = wd.findElement(By.xpath(".//*[@id='password']"));
		password.sendKeys("123456");

		System.out.println("Step 5: Click the Submit Button");
		WebElement login = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		login.click();

		System.out.println("Step7:Login sucessfully");
		WebElement adduser = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		adduser.click();

		System.out.println("step8: Add User");
		WebElement adduser1 = wd
				.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		adduser1.click();

		System.out.println("Step9: Register");
		WebElement username=wd.findElement(By.xpath(".//*[@id='username']"));
		username.sendKeys("Gaurav");
		
		System.out.println("Step10:Enter the Mobile Number");
		WebElement mob=wd.findElement(By.xpath(".//*[@id='mobile']"));
		mob.sendKeys("860015158");
		
		System.out.println("Step11:Email id");
		WebElement mail=wd.findElement(By.xpath(".//*[@id='email']"));
		mail.sendKeys("gdhamale01");
		
		System.out.println("step12:Gender");
		WebElement gender=wd.findElement(By.xpath(".//*[@id='Male']"));
		gender.click();
		
		
	}
}
