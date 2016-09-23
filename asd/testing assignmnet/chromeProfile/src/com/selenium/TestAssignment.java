package com.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestAssignment {

	@Test
	public void TestFunc()
	{
		/*System.setProperty ("webdriver.chrome.driver","D:\\assignmnets\\selenium jars\\Selenium-for-Training\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/user_name/AppData/Local/Google/Chrome/User Data");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http:www.google.com");*/
		
		System.setProperty ("webdriver.chrome.driver","D:\\assignmnets\\selenium jars\\Selenium-for-Training\\chromedriver.exe");
		String userProfile= "C:\\Users\\user_name\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir="+userProfile);
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		System.out.println("asd");
		driver.get("http://www.google.com");
	}
	
}
