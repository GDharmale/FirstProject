package TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parametrs {
	WebDriver driver;
@Test
public void GmailLoginTest(){
	System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	driver.findElement(By.xpath(".//*[@id='identifierId']")).clear();
	driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("gdharmale01@gmail.com");
	driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	driver.close();
}
}