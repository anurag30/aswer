package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class TestAssignmnet {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		/* driver.get("http://www.google.co.in");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium webdriver");
      
           
        System.out.println("Below list is printed by Webdriver");
        List<WebElement> options = driver.findElements(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li"));
        for (WebElement webElement : options) {
            System.out.println(webElement.getText());
        }
    
        driver.close();
        driver.quit();*/
		
		
		 driver.get("http://google.com");  
		 Thread.sleep(3000);
		  driver.findElement(By.id("gbqfq")).sendKeys("vam");  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		    
		   WebElement table = driver.findElement(By.className("gssb_m"));   
		   List<WebElement> rows = table.findElements(By.tagName("tr"));   
		   Iterator<WebElement> i = rows.iterator();   
		   System.out.println("-----------------------------------------");   
		   while(i.hasNext()) {   
		           WebElement row = i.next();   
		           List<WebElement> columns = row.findElements(By.tagName("td"));   
		           Iterator<WebElement> j = columns.iterator();   
		           while(j.hasNext()) {   
		                   WebElement column = j.next();   
		                   System.out.println(column.getText());   
		           }   
		           System.out.println("");   
		              
		   System.out.println("-----------------------------------------");   
		   }   
		  }   
	
}
