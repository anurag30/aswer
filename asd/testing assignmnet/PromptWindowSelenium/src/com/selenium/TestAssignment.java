package com.selenium;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestAssignment {

	@Test
	public void testfunc() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://www.google.com");
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/button")).click();
		Alert alert=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("qwerty");
		alert.accept();
		String asd=driver.findElement(By.xpath(".//*[@id='demo']")).getText();
		System.out.println(asd);
		driver.findElement(By.xpath("html/body/button")).click();
		alert=driver.switchTo().alert();
		alert.dismiss();
		asd=driver.findElement(By.xpath(".//*[@id='demo']")).getText();
		System.out.println(asd);
	}
}
