package com.selenium;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestAssignment {

	public static void main(String[] args) throws InterruptedException {
		TestAssignment test=new TestAssignment();
		test.printThemAll();
	}
	
@Test
public void printThemAll() throws InterruptedException {

	Properties prop = new Properties();
	InputStream input = null;
	
	try {
    
		String filename = "myfile.properties";
		input = getClass().getClassLoader().getResourceAsStream(filename);
		if(input==null){
	            System.out.println("Sorry, unable to find " + filename);
		    return;
		}
		prop.load(input);

		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
            
	        if(browser.equals("firefox")) 
	        {
	        	WebDriver driver=new FirefoxDriver();
	        	driver.get(url);
	        	driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[1]/a")).click();
	        	String title=driver.getTitle();
	        	Assert.assertEquals(title,"Careers");
	        	driver.manage().window().maximize();
	        }
	        
	        else if(browser.equals("chrome"))
	        {
	        	System.setProperty("webdriver.chrome.driver","C:\\Users\\anuragch\\Desktop\\chromedriver.exe");
	        	WebDriver driver = new ChromeDriver();
	        	driver.get(url);
	        	driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[1]/a")).click();
	        	String title=driver.getTitle();
	        	Assert.assertEquals(title,"Careers");
	        	driver.manage().window().maximize();
	        }
	        else if(browser.equals("IE"))
	        {
	        	System.setProperty("webdriver.ie.driver", "C:\\Users\\anuragch\\Desktop\\IEDriverServer.exe");
	    		WebDriver driver = new InternetExplorerDriver();
	    		Thread.sleep(4000);
	        	driver.get(url);
	        	Thread.sleep(8000);
	        	driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[1]/a")).click();
	        	String title=driver.getTitle();
	        	Assert.assertEquals(title,"Careers");
	        	driver.manage().window().maximize();
	        }

	} catch (IOException ex) {
		ex.printStackTrace();
    } finally{
    	if(input!=null){
    		try {
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	}
    }

}}