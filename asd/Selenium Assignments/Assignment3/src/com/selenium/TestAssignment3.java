package com.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import junit.framework.Assert;

public class TestAssignment3 {

	@Test
	public void Test() 
	{
		WebDriver driver = new HtmlUnitDriver();  
		driver.get("http://www.ehow.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "eHow | How to - Discover the expert in you! | eHow");
		driver.findElement(By.xpath(".//*[@id='Footer']/div[1]/div/div/div[2]/div/nav/ul/li[1]/ul/li[1]/a")).click();
		String aboutTitle=driver.getTitle();
		Assert.assertEquals(aboutTitle,"About eHow | eHow");
	}

}
