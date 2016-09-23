package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class ScreenshotTest {
	WebDriver driver;
	@Test
	public void TestFunc() throws IOException, InterruptedException
	{
		/*try{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		 driver.switchTo().defaultContent();  
		 driver.findElement(By.id("testing")).sendKeys("test");
		 
		
		}
		catch(Exception e)
		{
			 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
			 driver.quit();
		}*/
		
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		 
		//WebDriver  driver = new FirefoxDriver();
		  
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        // Launch the URL
	 
	        //driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	 
	        // Click on the Button "Timing Alert"
	 
	        //driver.findElement(By.id("timingAlert")).click();
	 
	        System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
	 
	        // Create new WebDriver wait
	 
	       // WebDriverWait wait = new WebDriverWait(driver, 10);
	 
	        // Wait for Alert to be present
	 
	       // Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	 
	        System.out.println("Either Pop Up is displayed or it is Timed Out");
	        //Thread.sleep(3000);
	 
	        // Accept the Alert
	 
	     //   myAlert.accept();
	 
	        System.out.println("Alert Accepted");
	 
	        // Close the main window
	 
	        //driver.close();
	 
		
	 

	}

}
