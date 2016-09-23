package com.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.pages.GoogleSearch;

public class TestAssignment {

	 /*WebDriver driver;
	 GoogleSearch sea;
	 
	 @BeforeTest
	 public void setup()
	 {
		
	 }
	 
	@Test
	 public void TestCase() throws InterruptedException
	 {
		 WebDriver driver = new FirefoxDriver();
		    driver.get("http://www.google.com");
		    sea.driver(driver);
		    sea.SetSearch("selenium");
		    
		    //WebElement element = driver.findElement(By.name("q"));
		   // element.sendKeys("Cheese!\n"); // send also a "\n"
		   // element.submit();

		    // wait until the google page shows the result
		    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
		              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

		 //
		// Thread.sleep(4000);
		// sea.clickSearch();
	 }*/
	
	
	///////////////////////////////////////
	
	WebDriver driver = new FirefoxDriver();
	 
	 
    @Test
    public void setup() throws Exception 
    { 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.google.com"); 
        driver.findElement(By.xpath("//input[@id='gbqfq']")).clear();
    	driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("selenium");
    	int i=1;
    	int j=i+1;
    	for(i=1; i<j;i++)
   		{ 
			String suggestion = driver.findElement(By.xpath("//*[@id='gsr']/table/tbody/tr[1]/td[2]/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[1]/span")).getText();

			System.out.println(suggestion);

			j++;     

		} 

    } 


    /*@AfterTest

    public void tearDown() throws Exception 
    { 
    	driver.quit();
    } 

//Data provider Is used for supplying 2 different values to Search_Test method.

    @DataProvider(name="search-data")

    public Object[][] dataProviderTest(){

    	return new Object[][]{{"selenium webdriver tutorial"},{"auto s"}};

    }


    @Test

    public void Search_Test(String Search){ 

    	driver.findElement(By.xpath("//input[@id='gbqfq']")).clear();

    	driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys(Search);

    	int i=1;

    	int j=i+1;

    	try{
//for loop will run till the NoSuchElementException exception.

    		for(i=1; i<j;i++)
 
    		{ 
//Value of variable i Is used for creating xpath of drop list's different elements.

    			String suggestion = driver.findElement(By.xpath("//*[@id='gsr']/table/tbody/tr[1]/td[2]/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[1]/span")).getText();

    			System.out.println(suggestion);

    			j++;     
 
    		} 

    	}
    	catch(Exception e){//Catch block will catch and handle the exception.

    		System.out.println("***Please search for another word***"); 

    		System.out.println();

    	}  
}
	
	*/
	
	
	
}
