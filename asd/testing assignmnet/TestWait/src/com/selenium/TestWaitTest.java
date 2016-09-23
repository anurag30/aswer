package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWaitTest {

	@Test
	public void TestFunc() throws InterruptedException, IOException
	{
		WebDriver  driver=new FirefoxDriver();
		try{
		
		driver.manage().window().maximize();
		driver.get("http://www.ecwid.com/in/demo");
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 45);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ecwid-products']/div/div/div/div/table/tbody/tr[2]/td/div/div/table/tbody/tr[1]/td[1]/div/a/img")));
		driver.findElement(By.xpath(".//*[@id='ecwid-search']/div/input")).sendKeys("Toy");
		driver.findElement(By.xpath(".//*[@id='ecwid-search']/div/button")).click();
		Thread.sleep(3000);
		List<WebElement> element1=driver.findElements(By.xpath(".//*[@id='ecwid-products']/div/div/div/div/table/tbody/tr[2]/td/div/div/div[3]/table/tbody/tr[1]/td/div/div/table/tbody/tr"));
		System.out.println(element1.size());
		driver.findElement(By.xpath(".//*[@class='gwt-ListBox']")).click();
		driver.findElement(By.xpath(".//*[@class='gwt-ListBox']/option[3]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(".//*[@class='ecwid-pager ecwid-pager-hasTopSeparator']/span[7]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("Shocking Pen")).click();
		driver.findElement(By.xpath("//div[@class='ecwid-productBrowser-productNameLink']//a[@href='#!/Shocking-Pen/p/4029']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@class='gwt-TextBox ecwid-productBrowser-details-qtyTextField']")).sendKeys("20");
		
		driver.quit();
		}
		catch(Exception e)
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           //The below method will save the screen shot in d drive with name "screenshot.png"
	              FileUtils.copyFile(scrFile, new File("C:\\screenshot.png"));
		}
}
	}
