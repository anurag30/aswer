package com.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAsignment {
	
	@Test
	public void TestFunc() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ehow.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".gtm_social.target.twitter.elegant-icons")).click();
		String Parent_Window = driver.getWindowHandle();
		 for (String Child_Window : driver.getWindowHandles())
		 {
		 driver.switchTo().window(Child_Window);
		  if(!Child_Window.equals(Parent_Window))
		   {
		 System.out.println(driver.getTitle());
		   }
		 }
		 driver.close();
		 driver.switchTo().window(Parent_Window);
		 System.out.println(driver.getTitle());
	}

}
