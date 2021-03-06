package CrossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	public WebDriver driver;
	
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	 
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String browserName) {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browserName.equalsIgnoreCase("firefox")) {
	 
	   driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browserName.equalsIgnoreCase("chrome")) { 
	 
	   // Here I am setting up the path for my IEDriver
	 
	   System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\Chrome\\chromedriver.exe");
	 
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	 
	  } 
	 
	  // Doesn't the browser type, lauch the Website
	 
	  driver.get("http://www.store.demoqa.com"); 
	 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  @Test public void login() throws InterruptedException {
	 
	 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	    driver.findElement(By.id("log")).sendKeys("testuser_1");
	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	 
	    driver.findElement(By.id("login")).click();
	 
	 }  
	 
	  @AfterClass public void afterTest() {
	 
	 driver.quit();
	 
	 }
}
