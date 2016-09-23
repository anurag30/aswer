package com.selenium;

import java.net.MalformedURLException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAssignmnet {

	@Test
	public void TestD() throws MalformedURLException, InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cybage.com");
		driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[4]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[5]/a")).click();
		driver.findElement(By.xpath(".//*[@id='txtSearch']")).sendKeys("Automation");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='headerDiv']/div[1]/div/div[2]/div/input[2]")).click();
		Thread.sleep(4000);
		int count=0;
		List<WebElement> findElements = driver.findElements(By.cssSelector(".search-results-panel"));
		 for (WebElement webElement : findElements)
		    {
		        count++;
		    }
		 System.out.println(findElements.size());
		driver.findElement(By.xpath(".//*[@id='searchResultsOuterDiv']/div[1]/a/span")).click();
		
}
}