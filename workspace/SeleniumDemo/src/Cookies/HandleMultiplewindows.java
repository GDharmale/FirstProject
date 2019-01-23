package Cookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultiplewindows {
@SuppressWarnings("unused")
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.naukri.com/");
	
	String parent=driver.getWindowHandle();
	Set<String>s1=driver.getWindowHandles();
	
	Iterator<String>I1=s1.iterator();
	while (I1.hasNext()) {
		String childWindow = (String) I1.next();
		
		
		if(!parent.equals(childWindow)){
			driver.switchTo().window(childWindow);
			System.out.println(driver.switchTo().window(childWindow).getTitle());
			driver.close();
		}
		driver.switchTo().parentFrame();
	}
			
	
	
	
	
}
}
