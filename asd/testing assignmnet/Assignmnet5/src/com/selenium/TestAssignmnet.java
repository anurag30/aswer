package com.selenium;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class TestAssignmnet {

	@Test
	public void TestD() throws MalformedURLException, InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[data-code='H']")).click();
		driver.findElement(By.cssSelector(".arrow_ddn_pointer.pull-right")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector(".dropdown ul li:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".segmented_controls.make_field.form-control a:nth-last-child(1)")).click();
	    driver.findElement(By.cssSelector("#from_city_data_box")).sendKeys("pune");
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("#hotels_submit")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(".//*[@id='hotelsListing']/div[1]/div[3]/div[7]/div[3]/div[2]/div/div/div/div/div[2]/div[2]/p[1]/span[1]/a")).click();
	    String hotelname=driver.getTitle();
	    Assert.assertEquals(hotelname, "St Laurn Business Hotel (Pune) Details | Book St Laurn Business Hotel at MakeMyTrip | Find Last Minute deals for St Laurn Business Hotel (Pune) Online");
	    
	}
}
