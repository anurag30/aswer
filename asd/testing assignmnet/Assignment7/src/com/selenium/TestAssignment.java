package com.selenium;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAssignment {
	
		@Test
		public void TestFunc() throws InterruptedException, IOException 
		{
			WebDriver driver=new  FirefoxDriver();
			driver.get("http://www.google.com");
			String[] param=new String[]{"D:\\login.exe", "Authentication Required","cybage","Test@123"};
			Runtime.getRuntime().exec(param);
			driver.get("http://cybagemis.cybage.com/Framework/Iframe.aspx");
			//driver.switchTo().alert().accept();;
		}
	}


