package com.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestAssignment2 {

	@Test
	public void Test() 
	{
		System.setProperty("webdriver.ie.driver", "D:\\assignmnets\\selenium jars\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ehow.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "eHow | How to - Discover the expert in you! | eHow");
		driver.findElement(By.xpath(".//*[@id='Footer']/div[1]/div/div/div[2]/div/nav/ul/li[1]/ul/li[1]/a")).click();
		String aboutTitle=driver.getTitle();
		Assert.assertEquals(aboutTitle,"About eHow | eHow");
	}
}
