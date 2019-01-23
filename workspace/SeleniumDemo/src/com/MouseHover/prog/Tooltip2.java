package com.MouseHover.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip2 {
	public static void main(String[] args) {

		String baseUrl = "http://demo.guru99.com/test/social-icon.html";

		System.setProperty("webdriver.chrome.driver", "G:\\EXE Files\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.get(baseUrl);

		String expectedToolTip = "Facebook";

		WebElement facebook = wd.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));

		String actualToolTip = facebook.getAttribute("title");

		System.out.println("Actual ToolTip Is:" + actualToolTip);
		if (actualToolTip.equals(expectedToolTip)) {
			System.out.println("Test Case is Passed");
		}
		wd.close();

	}

}
