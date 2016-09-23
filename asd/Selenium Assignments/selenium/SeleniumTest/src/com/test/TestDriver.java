package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestDriver 
{
	
	@Test
	public void TestD() throws MalformedURLException, InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='from_city_data_box']"));
	    element1.sendKeys("Pune");
	    
	    driver.findElement(By.xpath(".//*[@id='nightAnchor']/div/p[2]/span[2]")).click();
	    Thread.sleep(4000);
	    //Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='nightAnchor']/div/div/ul/li")));
	   // Select dropdown = new Select(driver.findElement(By.className("nights-dropdown-menu dropdown-menu")));
	  //  dropdown.selectByVisibleText("4");
	    
	 	
	   /* List<WebElement> allElements = driver.findElements(By.xpath(".//*[@id='nightAnchor']/div/div/ul"));
	    System.out.println(allElements);

	    for (WebElement element: allElements) {
	        System.out.println(element.getText().length());
	       char a[]=element.getText().toCharArray();
	        for(int i=1;i<10;i++)
	        {
	        	System.out.println(a[i]);
	        	int asd=a[i];
	        if(asd==4)
	        {
	        	System.out.println("qweer");
	        	 element.click();    
	        	 break;
	        }
	        }    
	    }*/
	    
	    List<WebElement> cssele = driver.findElements(By.cssSelector("li:nth-child(n)"));
	    for(WebElement element: cssele)
	    {
	    	System.out.println("aaaa");
	    	System.out.println(element.getText());
	    }
	    driver.findElement(By.xpath("//li[contains(text(), '4')]"));
	    driver.findElement(By.id("hotels_submit")).click();
	    driver.findElement(By.xpath(".//*[@id='hotelsListing']/div[1]/div[3]/div[7]/div[3]/div[2]/div/div/div/div/div[2]/div[2]/p[1]/span[1]/a")).click();
	    String hotelname=driver.getTitle();
	    Assert.assertEquals(hotelname, "St Laurn Business Hotel (Pune) Details | Book St Laurn Business Hotel at MakeMyTrip | Find Last Minute deals for St Laurn Business Hotel (Pune) Online");
	    
	    
	    
	    
	    
	    
	    /*WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
		List<WebElement> findElements=driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[3]/div/div[4]/div/div/div/span/span/div"));
		System.out.println(findElements);*/
		//using web driver opening of IE
		/* DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

		 //Method and Description - void setCapability(java.lang.String capabilityName, boolean value)
		 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

		 //Among the facilities provided by the System class are standard input, standard output, and error output streams; access to externally defined "properties"; a means of loading files and libraries; and a utility method for quickly copying a portion of an array.
		 System.setProperty("webdriver.ie.driver", "D:\\assignmnets\\selenium jars\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");

		 //InternetExplorerDriver(Capabilities capabilities)
		 WebDriver driver = new InternetExplorerDriver(capabilities);

		 driver.manage().window().maximize();
		 driver.get("http://google.com");*/

		
		
		//using selenium remote web driver start server for firefox
		/*DesiredCapabilities dc = DesiredCapabilities.firefox();
		URL url = new URL("http","localhost",4444,"/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("http://www.cybage.com");*/
		
		//using selenium remote web driver start server for chrome
		/*DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url = new URL("http","localhost",4444,"/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("http://www.google.com");*/
		
		//using web driver for chrome 
		/*System.setProperty("webdriver.chrome.driver","D:\\assignmnets\\selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cybage.com");
		driver.manage().window().maximize();*/
		
		//using web driver for firefox
	/*WebDriver driver=new FirefoxDriver();
	driver.get("http://www.cybage.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[1]/a")).click();
	String title=driver.getTitle();
	Assert.assertEquals(title, "Careers");
	driver.navigate().back();
	String title1=driver.getTitle();
	Assert.assertEquals(title1, "Outsourced Product Development | IT Services | Enterprise Business Solutions");
	*/
	}
}
