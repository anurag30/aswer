package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAssignment {

	@Test
	public void TestFunc() throws InterruptedException
	{
		WebDriver  driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath(".//*[@class='top-menu']/li[2]"));
		action.moveToElement(mainMenu).moveToElement(driver.findElement(By.xpath("html/body/div[5]/div[2]/ul[1]/li[2]/ul/li[2]/a"))).click().build().perform();
		driver.findElement(By.xpath("html/body/div[5]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='products-orderby']/option[4]")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='topcartlink']/a/span[1]")).click();
		/*List<WebElement> mains=driver.findElements(By.cssSelector(".product-item"));
		String s[]=new String[mains.size()];
		for(int i=1;i<=mains.size();i++)
		{
			System.out.println(i);
		s[i]=driver.findElement(By.xpath("html/body/div[5]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div["+i+"]/div/div[2]/div[3]/div[1]/span")).getText();
		System.out.println(s[i]);
		
		}*/
		Thread.sleep(4000);
		
		driver.quit();
	}
}
