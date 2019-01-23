package RobotClassDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailtest2 {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		String BaseUrl = "https://www.gmail.com";
		driver.get(BaseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();

		driver.findElement(By.name("identifier")).clear();
		driver.findElement(By.name("identifier")).sendKeys("gdharmale01@gmail.com");

		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		//driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("8600155158");
		
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		
		//Fluent wait Condition element to be visible
		WebDriverWait wait=new WebDriverWait(driver, 10000);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id=':i2']/div/div")));
		driver.findElement(By.xpath(".//*[@id=':i1']/div/div")).click();
		
		int Size= driver.findElements(By.tagName("iframe")).size();
		System.out.println("Size");
		
		
		String parentWindow=driver.getWindowHandle();
		Set<String>AllWindow=driver.getWindowHandles();
		System.out.println(AllWindow);
		
		/*for(String handle1:driver.getWindowHandles()){
			System.out.println(handle1);
			driver.switchTo().window(handle1);*/
		
		driver.switchTo().frame("F39F87EA39EDC99AA2E53C9365C9C38C");
			
			
			driver.findElement(By.xpath(".//*[@id=':ku']")).sendKeys("gdharmale01@gmail.com");
			driver.findElement(By.xpath(".//*[@id=':mv']")).sendKeys("Hii Am Sending You a Testing Mail");
			driver.findElement(By.xpath(".//*[@id=':ml']")).click();
			
			
			driver.close();
			
		}
		
	}

//}
