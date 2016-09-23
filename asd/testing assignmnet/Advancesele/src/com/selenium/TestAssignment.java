package com.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAssignment {

	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.xpath(".//*[@class='tabs_list clearfix']/li[1]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(element).click();
		WebDriverWait wait = new WebDriverWait(driver, 5); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class='all_menuoptionsList RobotoLight pull-left']/li[6]"))); 
		WebElement element1=driver.findElement(By.xpath(".//*[@class='all_menuoptionsList RobotoLight pull-left']/li[6]"));
		builder.moveToElement(element1).click().build().perform();
		
	
		
		
		
		
		
		
		/*WebElement element=driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[1]/a"));
		Actions builder=new Actions(driver);
		Action mouseover=builder.moveToElement(element).build();
		mouseover.perform();*/
		
		
		/*driver.get("http://www.jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Actions builder=new Actions(driver);
		WebElement dragelement=driver.findElement(By.id("draggable"));
		WebElement dropelement=driver.findElement(By.id("droppable"));
		builder.dragAndDrop(dragelement, dropelement);
		builder.build().perform();*/
		/*Action dragAndDrop=builder.clickAndHold(dragelement).moveToElement(dropelement).release(dropelement).build();
		dragAndDrop.perform();*/
		
		
		/*driver.get("http://www.cybage.com");
		driver.manage().window().maximize();
		Actions builder=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@class='nav navbar-nav']/li[2]"));*/
		/*builder.moveToElement(element);
		WebElement element1=driver.findElement(By.xpath(".//*[@id='78']/li[3]/a"));
		builder.moveToElement(element1);
		builder.click().build().perform();*/
		
		
		//builder.moveToElement(element).moveToElement(driver.findElement(By.xpath(".//*[@id='78']/li[3]/a"))).click().build().perform();
		
		
		
	}
}
