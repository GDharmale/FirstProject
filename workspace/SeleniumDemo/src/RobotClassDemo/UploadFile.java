package RobotClassDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class UploadFile {
	
WebDriver driver;
String BaseUrl="https://blueimp.github.io/jQuery-File-Upload/";

@Test
public void testUpload() throws AWTException, InterruptedException{
	System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\Chrome\\chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.get(BaseUrl);
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver, 1000);
	
	driver.findElement(By.xpath("//input[@type='file']")).click();
	Thread.sleep(2000);
    uploadFile("C:\\Users\\Samsung\\Desktop.jpg");
	Thread.sleep(2000);
	
}

public static void setClipBoardData(String string){
	StringSelection stringselection=new StringSelection(string);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
	
}

public static void uploadFile(String fileLocation) throws AWTException{
	setClipBoardData(fileLocation);
	Robot robot=null;
	
	try{
		robot=new Robot();
	}
	catch(AWTException e){
		e.printStackTrace();
		
	}
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
}


}
