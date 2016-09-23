package com.selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAssignmnet {

	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cybage.com");
		driver.findElement(By.xpath(".//*[@id='WebPartWPQ2']/div[1]/ul/li[2]/a/span[1]")).click();
		List<WebElement> select=driver.findElements(By.xpath(".//*[@id='dvFooter']/div[2]/ul/li"));
		for(WebElement element:select)
		{
			System.out.println(element.getText());
		}
		driver.findElement(By.xpath(".//*[@id='WebPartWPQ2']/div[1]/ul/li[2]/div/div/div[3]/span/a/h4")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[5]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='txtSearch']")).sendKeys("Supply Chain");
		driver.findElement(By.xpath(".//*[@id='headerDiv']/div[1]/div/div[2]/div/input[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='inputComments']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='inputComments']")).sendKeys("Testing and QA");
		driver.findElement(By.xpath(".//*[@id='ctl00_SPWebPartManager1_g_80077556_d3f2_4b6b_a5a0_51e1aac58cf5']/div[1]/div[2]/input")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[3]/a")).click();
	}
}
