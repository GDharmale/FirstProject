import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DemoForNewTab {
public static void main(String[] args) throws AWTException, InterruptedException {
	 WebDriver driver=new FirefoxDriver();
	 driver.get("http://google.co.in/");
	 
	 Robot rob=new Robot();
	 rob.keyPress(KeyEvent.VK_CONTROL);
	 rob.keyPress(KeyEvent.VK_T);
	 Thread.sleep(2000);
	 driver.get("https://www.google.co.in");
	 Thread.sleep(2000);
	 
driver.close();
}
}