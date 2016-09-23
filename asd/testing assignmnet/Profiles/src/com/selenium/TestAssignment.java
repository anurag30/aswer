package com.selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class TestAssignment {
	
	/*@Test
	public void test() throws InterruptedException
	{
		ProfilesIni profile=new ProfilesIni();
		FirefoxProfile firefox=profile.getProfile("TestProfile");
		WebDriver driver=new FirefoxDriver(firefox);
		Thread.sleep(4000);
		driver.get("https://www.google.com");
	
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.dir","C:\\Users\\anuragch\\Desktop\\");
		profile.setPreference("intl.accept_languages","en-us");
		profile.setPreference("browser.startup.homepage","http://www.google.com");
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE,profile);
		WebDriver driver=new FirefoxDriver(dc);
		driver.get("http://www.gmail.com/");
		
		String URL = "http://medialize.github.io/jQuery-contextMenu/demo.html";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		By locator = By.xpath("html/body/div[1]/section/div/div/div/p/span");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
		WebElement element=driver.findElement(locator);
		Actions action = new Actions(driver).contextClick(element);
		action.build().perform();
		
		WebElement elementEdit =driver.findElement(By.xpath(".//*[@id='context-menu-layer']/ul/li[3]"));
		System.out.println("asd");
		elementEdit.click();
		Alert alert=driver.switchTo().alert();
		String textEdit = alert.getText();
		Assert.assertEquals(textEdit, "clicked: edit", "Failed to click on Edit link");
		
		
	}*/
	
	public static void main(String[] args) {

	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("Cheese!\n"); // send also a "\n"
	    element.submit();

	    // wait until the google page shows the result
	    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

	    List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));

	    // this are all the links you like to visit
	    for (WebElement webElement : findElements)
	    {
	        System.out.println(webElement.getAttribute("href"));
	    }
	}

}
