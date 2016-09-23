package com.selenium;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAssigment {

	@Test
	public void TestD() throws MalformedURLException, InterruptedException
	{		WebDriver driver=new FirefoxDriver();		driver.get("http://www.google.com");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='archive-link']/a")).click();
		Select dropdown = new Select(driver.findElement(By.id("lang-chooser")));
		dropdown.selectByValue("hi");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='archive-list']/li[1]/div[1]/div[1]/a/img")).click();
	}
}