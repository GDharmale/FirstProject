package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFile {

	
	@Test
	public void testAuto() throws IOException, InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Samsung/Desktop/FileUpload.html");
		
		driver.findElement(By.name("resumeUpload"));
		Thread.sleep(1000);	
		driver.findElement(By.name("resumeUpload")).click();
		Thread.sleep(3000);	
		Runtime.getRuntime().exec("C:\\Users\\Samsung\\Desktop\\Aut\\fileupload.exe");
		
		driver.quit();
		
		
	 }
}
