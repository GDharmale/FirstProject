import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.webkitRTCPeerConnection;

public class NewPratic {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new FirefoxDriver();
		System.out.println("Step1: Open the Browser and Get the URL pof Current Page");

		System.out.println("Step2:To get the Current Page URL");
		wd.get("file:///G:/Selenium%20Softwares/Selenium%20Software/Offline%20Website/index.html");
		// to get the url of current page use the following code.
		wd.manage().window().maximize();
		

		String s = wd.getCurrentUrl();
		System.out.println(s);

		String s1 = wd.getTitle();
		System.out.println("Step3:Check the Title of Page");
		System.out.println(s1);

		System.out.println(" Step4:To check the Page Heading");
		WebElement we = wd.findElement(By.xpath("html/body/div[1]/div[1]/a"));
		String s2 = we.getText();
		System.out.println(s2);

		// wd.close();
		System.out.println("Step5:Check Form Heading");
		WebElement we1 = wd.findElement(By.xpath("html/body/div[1]/div[2]/p"));
		String s3 = we1.getText();
		System.out.println(s3);

		System.out.println("Step6: Check the placeholder of email Text Box");
		String place = wd.findElement(By.xpath(".//*[@id='email']")).getAttribute("placeholder");
		System.out.println(place);

		System.out.println("Step7: Check the placeholder of Password Text Box");
		String placepwd = wd.findElement(By.xpath(".//*[@id='password']")).getAttribute("placeholder");
		System.out.println(placepwd);

		System.out.println("Step8:Enter the InValid EmailId");
		WebElement email = wd.findElement(By.xpath(".//*[@id='email']"));
		email.sendKeys("Gaurav@gmail.com");
		Thread.sleep(2000);

		System.out.println("Step9: enter the Invalid Password");
		WebElement PWD = wd.findElement(By.xpath(".//*[@id='password']"));
		PWD.sendKeys("12345");
		Thread.sleep(2000);

		System.out.println("Step10:Click the SignIn Button");
		WebElement signin = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		signin.click();
		Thread.sleep(2000);

		System.out.println("Step11:Checking the error Message of Email Field");
		WebElement wrongemail = wd.findElement(By.xpath(".//*[@id='email_error']"));
		String s4 = wrongemail.getText();
		String exp = "Please enter email as kiran@gmail.com";
		Assert.assertEquals(s4, exp);
		// System.out.print(Assert.assertEquals(s4, exp));
		System.out.println(s4);

		System.out.println("Step12:Checking the error Messgae of Password Field");
		WebElement Wrongpwd = wd.findElement(By.xpath(".//*[@id='password_error']"));
		String s5 = Wrongpwd.getText();
		System.out.println(s5);

		System.out.println("step13:Clear the data in email & Password Field");
		WebElement weclear = wd.findElement(By.xpath(".//*[@id='email']"));
		weclear.clear();

		WebElement pwdclear = wd.findElement(By.xpath(".//*[@id='password']"));
		pwdclear.clear();
		Thread.sleep(2000);

		System.out.println("Step14: Click the signIn Button");
		WebElement sign = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		sign.click();
		Thread.sleep(2000);

		System.out.println("Step15:Enter the Blank EmailId");
		WebElement blankmail = wd.findElement(By.xpath(".//*[@id='email_error']"));
		String s6 = blankmail.getText();
		System.out.println(s6);

		System.out.println("Step16:Enter the Blank Password");
		WebElement blankpwd = wd.findElement(By.xpath(".//*[@id='password_error']"));
		String s7 = blankpwd.getText();
		System.out.println(s7);
		Thread.sleep(2000);

		System.out.println("Step17:Click the New Register Link");
		WebElement register = wd.findElement(By.linkText("Register a new membership"));
		register.click();
		Thread.sleep(2000);

		System.out.println("To get the CurrentUrl of Next Hyperlink Page");
		String s17 = wd.getCurrentUrl();
		System.out.println(s17);

		System.out.println("Step18:Check the PlaceHolder Of name field");
		String name = wd.findElement(By.xpath(".//*[@id='name']")).getAttribute("placeholder");
		System.out.println(name);
		Thread.sleep(2000);

		System.out.println("Step19:Check the PlaceHolder Of Mobile field");
		String mobile = wd.findElement(By.xpath(".//*[@id='mobile']")).getAttribute("placeholder");
		System.out.println(mobile);
		Thread.sleep(2000);

		System.out.println("Step20:Check the PlaceHolder Of Email field");
		String email1 = wd.findElement(By.xpath(".//*[@id='email']")).getAttribute("placeholder");
		System.out.println(email1);
		Thread.sleep(2000);

		System.out.println("Step21:Check the PlaceHolder Of Password field");
		String password = wd.findElement(By.xpath(".//*[@id='password']")).getAttribute("placeholder");
		System.out.println(password);
		Thread.sleep(2000);

		System.out.println("Step22:Click the SignIn Button");
		WebElement sign1 = wd.findElement(By.xpath(".//*[@id='form']/div[5]/div/button"));
		sign1.click();
		Thread.sleep(2000);

		String name1 = wd.findElement(By.xpath(".//*[@id='name_error']")).getText();
		System.out.println(name1);
		Assert.assertEquals(name1, "Please enter Name.");

		String Mobile1 = wd.findElement(By.xpath(".//*[@id='mobile_error']")).getText();
		System.out.println(Mobile1);
		Assert.assertEquals(Mobile1, "Please enter Mobile.");

		String Email1 = wd.findElement(By.xpath(".//*[@id='email_error']")).getText();
		System.out.println(Email1);
		Assert.assertEquals(Email1, "Please enter Email.");

		String PWD1 = wd.findElement(By.xpath(".//*[@id='password_error']")).getText();
		System.out.println(PWD1);
		Assert.assertEquals(PWD1, "Please enter Password.");

		WebElement name2 = wd.findElement(By.xpath(".//*[@id='name']"));
		name2.sendKeys("Gaurav");

		WebElement Mobile2 = wd.findElement(By.xpath(".//*[@id='mobile']"));
		Mobile2.sendKeys("9970036647");

		WebElement Email2 = wd.findElement(By.xpath(".//*[@id='email']"));
		Email2.sendKeys("Gaurav@gmail.com");

		WebElement Password2 = wd.findElement(By.xpath(".//*[@id='password']"));
		Password2.sendKeys("121");

		WebElement sign2 = wd.findElement(By.xpath(".//*[@id='form']/div[5]/div/button"));
		sign2.click();

		Alert al = wd.switchTo().alert();
		Thread.sleep(2000);
		al.accept();

		WebElement alraedy = wd.findElement(By.xpath("html/body/div[1]/div[2]/a"));
		alraedy.click();

		System.out.println("Step23:Enter the valid Email");
		WebElement mail = wd.findElement(By.xpath(".//*[@id='email']"));
		mail.sendKeys("kiran@gmail.com");
		Thread.sleep(2000);

		System.out.println("Step24:Enter the valid Password");
		WebElement password1 = wd.findElement(By.xpath(".//*[@id='password']"));
		password1.sendKeys("123456");
		Thread.sleep(2000);

		WebElement click = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		click.click();

		WebElement user = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		user.click();

		WebElement Adduser = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		Adduser.click();

		WebElement username = wd.findElement(By.xpath(".//*[@id='username']"));
		username.sendKeys("GauravBhau");

		WebElement Mobile = wd.findElement(By.xpath(".//*[@id='mobile']"));
		Mobile.sendKeys("121");

		WebElement Email = wd.findElement(By.xpath(".//*[@id='email']"));
		Email.sendKeys("gdharmale@yahoo.com");

		WebElement Gender = wd.findElement(By.xpath(".//*[@id='Male']"));
		Gender.click();

		Select p = new Select(wd
				.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")));
		Thread.sleep(2000);
		p.selectByVisibleText("Punjab");

		WebElement pwd = wd.findElement(By.xpath(".//*[@id='password']"));
		pwd.sendKeys("1234");
		Thread.sleep(2000);

		WebElement submit = wd.findElement(By.xpath(".//*[@id='submit']"));
		submit.click();

		
		  WebElement cancel=wd.findElement(By.xpath(
		  "html/body/div[1]/div[1]/section[2]/div/div/div/form/div[2]/a/span")); 
		  cancel.click();
		  
		 
		 

		Alert al2 = wd.switchTo().alert();
		Thread.sleep(2000);
		al2.accept();

		WebElement weuser = wd.findElement(By.linkText("Users"));
		weuser.click(); 
		
		
		WebElement table=wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
		for(int j =1; j<=5; j++) {
			for(int i=1;i<=5;i++){
				WebElement tblele = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+j+"]/td["+i+"]"));
				System.out.print(" " + tblele.getText());
			}
			System.out.println();
			
		}
		System.out.println("Step25:To click Logout Button");
		WebElement logout=wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[5]/a/span"));
		logout.click();
		
		WebElement LogoutMsg=wd.findElement(By.xpath("html/body/div[1]/div[2]/p[2]"));
		String s11=LogoutMsg.getText();
		System.out.println(s11);
		
		wd.close();
		
	
	
	}
	
	

}
