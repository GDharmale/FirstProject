package com.MouseHover.prog;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

@SuppressWarnings("unused")
public class Actionex {
	public static void main(String[] args) {
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.carmax.com/");
		wd.manage().window().maximize();
		Actions act = new Actions(wd);
		WebElement E = wd.findElement(By.linkText("CARS FOR SALE"));
		WebElement E1 = wd.findElement(By.linkText("Why CarMax?"));
act.moveToElement(E).build().perform();
act.moveToElement(E1).click().build().perform();
wd.close();
	}
}