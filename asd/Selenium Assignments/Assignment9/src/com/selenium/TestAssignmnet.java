package com.selenium;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAssignmnet {

	@Test
	public void testfunc() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cybintranet:8085/HomePage_Applications/Submit%20a%20photo.aspx");
		String[] param=new String[]{"D:\\Photo.exe", "Authentication Required","Photos Upload"};
		Runtime.getRuntime().exec(param);
		
	}
}
