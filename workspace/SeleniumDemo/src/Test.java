import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) {
		System.out.println("Step 1: Get the url");
		WebDriver wd=new FirefoxDriver();
		
		System.out.println("Step2:");
		wd.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		System.out.println("Step no3:Provide the mail Id");
		WebElement mail=wd.findElement(By.xpath(".//*[@id='identifierId']"));	
		mail.sendKeys("gdharmale01@gmail.com");
		
		System.out.println("step:click the next button" );
		WebElement next=wd.findElement(By.xpath(".//*[@id='identifierNext']/content/span"));	
		next.click();		}

}
