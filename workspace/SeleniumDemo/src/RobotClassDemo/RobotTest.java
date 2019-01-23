package RobotClassDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class RobotTest {
	public WebDriver driver;
    public WebDriverWait wait;
    private static String filePath = System.getProperty("user.dir") + "C:\\Users\\Samsung\\Desktop.png";
 
    @BeforeMethod
    public void setup () {
        driver = new FirefoxDriver();
        driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();
    }
 
    @Test
    public void robotTest () throws InterruptedException {
        //Click Image Upload
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button")));
        driver.findElement(By.xpath(".//*[@id='fileupload']/div/div[1]/span[1]/input")).click();
        Thread.sleep(2000);
        uploadFileWithRobot("C:\\Users\\Samsung\\Desktop.png");
        //Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='fileupload']/div/div[1]/span[1]/input"))).getText().equals("C:\\Users\\Samsung\\Desktop\\marathi quotes.png"));
        //I added sleep to see the result with my eyes. If you want you can remove below line.
        Thread.sleep(2000);
    }
 
    @AfterMethod
    public void teardown () {
        driver.quit();
    }
 
    //File upload by Robot Class
    public void uploadFileWithRobot (String imagePath) throws InterruptedException {
        StringSelection stringSelection = new StringSelection(imagePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
 
        Robot robot = null;
 
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
 
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}