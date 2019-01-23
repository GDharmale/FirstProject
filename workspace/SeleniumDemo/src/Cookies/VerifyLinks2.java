package Cookies;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLinks2 {
	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://google.co.in/");
		 
		 List<WebElement> links= driver.findElements(By.tagName("a"));
		 System.out.println("The Total Links Are:"+links.size());
		 
		 for(int i=0; i<links.size();i++){
			  WebElement element=links.get(i);
			  String url=element.getAttribute("href");
			  verifyLinkActive(url);
			 
		 }
		 
		 
	}

	private static void verifyLinkActive(String linkUrl) {
		try{
			
			URL url=new URL(linkUrl);
			HttpURLConnection httpurlConnection=(HttpURLConnection)url.openConnection();
			httpurlConnection.setConnectTimeout(2000);
			httpurlConnection.connect();
			
			if(httpurlConnection.getResponseCode()==200){
				System.out.println(linkUrl+"----"+httpurlConnection.getResponseCode());
				
			}
			if(httpurlConnection.getResponseCode()==httpurlConnection.HTTP_NOT_FOUND){
				System.out.println(linkUrl+"----"+httpurlConnection.getResponseCode()+linkUrl+"---"+HttpURLConnection.HTTP_NOT_FOUND);
				
			}
		}
			catch(Exception e){
				
				
			}
			
		
		
	}

}
