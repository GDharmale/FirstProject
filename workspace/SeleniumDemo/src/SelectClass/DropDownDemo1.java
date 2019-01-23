package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.manage().getCookies());
		
		

		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByIndex(4);

		WebElement month = driver.findElement(By.id("month"));
		Select select1 = new Select(month);
		select1.selectByValue("4");

		WebElement year = driver.findElement(By.id("year"));
		Select select2 = new Select(year);
		select2.selectByVisibleText("1993");

	}

}
