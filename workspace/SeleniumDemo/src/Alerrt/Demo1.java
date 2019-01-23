package Alerrt;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String baseUrl = "http://demo.guru99.com/test/delete_customer.php";

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		List<WebElement> iframeElements=driver.findElements(By.tagName("iframe"));
		System.out.println("The toatal No Of Frames Are:"+ iframeElements.size());

		driver.findElement(By.xpath("//input[@name='submit' and @value='Submit']")).click();

		Alert alert = driver.switchTo().alert();

		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(2000);

		alert.accept();

		String alertmessage2 = driver.switchTo().alert().getText();
		System.out.println(alertmessage2);
		alert.accept();

		driver.close();

	}

}
