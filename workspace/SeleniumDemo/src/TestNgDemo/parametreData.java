package TestNgDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utility.TestUtility;

public class parametreData {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtility.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void facebookLoginPage(String Name, String LastName, String MobileNumber, String Password) {
		
			/*System.out.println(0);
		System.out.println("Name="+Name);
		System.out.println("LastName="+LastName);
		//System.out.println("Name="+Name);
*/		
		
		driver.findElement(By.xpath(".//input[@id=\"u_0_j\"]")).clear();
		driver.findElement(By.xpath(".//input[@id=\"u_0_j\"]")).sendKeys(Name);

		
		
		driver.findElement(By.xpath(".//*[@id='u_0_p']")).clear();
		driver.findElement(By.xpath(".//*[@id='u_0_p']")).sendKeys(LastName);

		driver.findElement(By.xpath(".//*[@id='u_0_s']")).clear();
		driver.findElement(By.xpath(".//*[@id='u_0_s']")).sendKeys(MobileNumber);

		driver.findElement(By.xpath(".//*[@id='u_0_z']")).clear();
		driver.findElement(By.xpath(".//*[@id='u_0_z']")).sendKeys(Password);

		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
