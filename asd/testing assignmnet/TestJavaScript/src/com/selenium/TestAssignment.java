package com.selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAssignment {

	@Test
	public void testfunc() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://www.google.com");
		driver.get("http://www.w3schools.com//js//tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/button")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
	}
}