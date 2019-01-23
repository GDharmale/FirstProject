package TestNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

	@BeforeSuite
	//this will execute First
	public void setup() {
		System.out.println("Set System Property");
	}

	@BeforeClass
	//this will execute Third
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}

	@BeforeTest
	//this will execute Second
	public void login() {
		System.out.println("Loagoin to App");
	}

	@BeforeMethod
	//this will execute Fourth
	public void EnterUrl() {
		System.out.println("Enter The URL" + "");
	}
	
	@Test
	//this will execute Fifth
	public void GooglePageTitle(){
		System.out.println("Google Page title");
	}
	
	
	@AfterMethod
	//this will execute Sixth
	public void LogOut(){
		System.out.println("Logout From The App");
	}
	
	@AfterTest
	//this will execute Eight  
	public void deleteAllCookies(){
		System.out.println("Delete All cookies");
	}
	@Test
	public void c1(){
		System.out.println("Check The Samll Sequence1");
	}
	
	@Test
	public void C1(){
		System.out.println("Check The Capital Sequence1");
	}
	@Test
	public void C2(){
		System.out.println("Check The Capital Sequence2");
	}
	
	@AfterClass
	//this will execute Seventh
	public void Closebrowser(){
		System.out.println("Close the Browser");
	}
	@AfterSuite
	public void generatetestReport(){
		System.out.println("Generate Test Report");
	}
}

