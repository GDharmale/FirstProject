package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFile2 {
	
	@Test
	
	public void test() throws IOException{
		
	
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("http://tinyupload.com/");
	
	driver.findElement(By.name("uploaded_file")).click();
	Runtime.getRuntime().exec("C:\\Users\\Samsung\\Desktop\\121\\RunFile.exe");


}
}
