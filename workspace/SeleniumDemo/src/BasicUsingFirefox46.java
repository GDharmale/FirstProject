	

import java.awt.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicUsingFirefox46 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("1");
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///C:/JBK%20Eclipse%20Configured%2064-bit/Lib%20JBK/Selenium%20Software/Offline%20Website/index.html");
	     wd.manage().window().maximize();
	     
		//wd.manage().window().fullscreen();
		wd.manage().deleteAllCookies();
		System.out.println("2");
		WebElement weUser = wd.findElement(By.xpath("*//input[@class='form-control']"));
		weUser.clear();
		weUser.sendKeys("kiran@gmaill.com");
		
		System.out.println("3");
		WebElement weError1 = wd.findElement(By.id("email_error"));
		String labelError1 = weError1.getText();
		System.out.println(labelError1);

		System.out.println("4");
		WebElement wePswd = wd.findElement(By.xpath(".//*[@id='password']"));
		wePswd.sendKeys("123456");

		System.out.println("5");
		WebElement weError2 = wd.findElement(By.id("password_error"));
		String labelError2 = weError2.getText();
		System.out.println(labelError2);

		System.out.println("6");
		WebElement weButton = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		weButton.click();
		
		System.out.println("7");
		WebElement emailerror = wd.findElement(By.xpath(".//*[@id='email_error']"));
		System.out.println(emailerror.getText());
		
		System.out.println("8");
		WebElement weUser11 = wd.findElement(By.id("email"));
		weUser11.clear();
		weUser11.sendKeys("kiran@gmail.com");
		
		System.out.println("9");
		WebElement weButtonag = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		weButtonag.click();

		System.out.println("10");
		WebElement weUser1 = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		weUser1.click();
		
		System.out.println("11");
		WebElement weAddUser = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		weAddUser.click();
		Thread.sleep(500);
		
		System.out.println("12");
		WebElement weUname = wd.findElement(By.xpath(".//*[@id='username']"));
		weUname.sendKeys("darshit");
		
		System.out.println("13");
		 WebElement weMob = wd.findElement(By.xpath(".//*[@id='mobile']"));
		weMob.sendKeys("111112");
		
		System.out.println("15");
		WebElement weEmail = wd.findElement(By.xpath(".//*[@id='email']"));
		weEmail.sendKeys("darshit@gmail.com");
		
		System.out.println("16");
		WebElement weGender = wd.findElement(By.xpath(".//*[@id='Female']"));
		weGender.click();
		
		System.out.println("17");
		Select s=new Select(wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")));
		Thread.sleep(2000);
		s.selectByVisibleText("Punjab");
		
		System.out.println("18");
		WebElement wePwd = wd.findElement(By.xpath(".//*[@id='password']"));
		wePwd.sendKeys("123789");
		
		System.out.println("19");
		WebElement weSubmit = wd.findElement(By.xpath(".//*[@id='submit']"));
		weSubmit.click();
		
		System.out.println("20");
		Alert al = wd.switchTo().alert();
		Thread.sleep(2000);
		al.accept(); 

		Thread.sleep(3000);
		
		System.out.println("21");
		WebElement weuser = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		weuser.click();

/********************  Logic for table printing *********************/
		
		WebElement table=wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
	java.util.List<WebElement>tr=table.findElements(By.tagName("tr"));
	System.out.println("Total Num OF Rows "+tr.size());
	
	for(WebElement row:tr){
		java.util.List<WebElement>td=table.findElements(By.tagName("td"));
		System.out.println("Total Num OF Columns "+td.size());
		
		for(WebElement col:td){
			System.out.println(col.getText());
			
		}
		System.out.println("..............");
	}
	
	
	wd.close();
	
	}

}
 