package TestNgDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://google.co.in/");
	}

	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test
	public void googleLogoTest() {
		boolean b1 = driver.findElement(By.xpath(".//*[@id='hplogo']")).isDisplayed();
	}

	@Test
	public void mailLinkTest() {
		boolean b2 = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
