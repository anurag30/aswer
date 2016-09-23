package com.test;

import java.net.MalformedURLException;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignmnet {

	@Test
	public void TestD() throws MalformedURLException, InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		
	   // driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[3]/div/div[4]/div/div/div/span/span/div/span/div[2]/p")).click();;
	    driver.findElement(By.xpath(".//*[@id='nightAnchor']/div/p[2]/span[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(".//*[@id='nightAnchor']/div/div/ul/li[4]/a")).click();
	    driver.findElement(By.xpath(".//*[@id='roomDiv_1']/div/div/div[2]/div/div/a[2]")).click();
	    driver.findElement(By.xpath(".//*[@id='from_city_data_box']")).sendKeys("pune");
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(".//*[@id='hotels_submit']")).click();
	    driver.findElement(By.xpath(".//*[@id='hotelsListing']/div[1]/div[3]/div[7]/div[3]/div[2]/div/div/div/div/div[2]/div[2]/p[1]/span[1]/a")).click();
	    String hotelname=driver.getTitle();
	    Assert.assertEquals(hotelname, "St Laurn Business Hotel (Pune) Details | Book St Laurn Business Hotel at MakeMyTrip | Find Last Minute deals for St Laurn Business Hotel (Pune) Online");
	    
	}
}
