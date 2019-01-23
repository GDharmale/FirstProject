import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class moveTo {
	public static void main(String[] args) {
		
		WebDriver wd=new FirefoxDriver();
		
		 System.out.println("Open the Site");
		 wd.get("https://www.carmax.com/");
		 wd.manage().window().maximize();
		 
		 System.out.println("locate the element");
		 WebElement we=wd.findElement(By.linkText("CARS FOR SALE"));
		 
		 System.out.println("CREATE THE ACTIONS CLASS");
		 Actions ACT=new Actions(wd);
		 ACT.moveToElement(we).build().perform();
		 
		 System.out.println("click the another link");
		 WebElement we1=wd.findElement(By.linkText("Why CarMax?"));
		 ACT.moveToElement(we1).click().build().perform();
		 
		 
	}

}
