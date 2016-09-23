package com.pages;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {

	WebDriver driver;
	@Test
	public void driver(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(name="q")
	WebElement elementSearchBox;
	
	@FindBy(name="btnK")
	WebElement clickButton;
	
	public void SetSearch(String search)
	{
		
	   
		elementSearchBox.sendKeys(search);
		clickSearch();
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
	}
	
	public void clickSearch()
	{
		clickButton.submit();;
	}
}
