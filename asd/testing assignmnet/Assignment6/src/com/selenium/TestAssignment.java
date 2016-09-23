package com.selenium;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAssignment {

	@Test
	public void TestFunc() throws InterruptedException
	{
		WebDriver driver=new  FirefoxDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('hello world');");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();;
	}
}
