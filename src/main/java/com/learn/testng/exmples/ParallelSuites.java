package com.learn.testng.exmples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelSuites {
	
	public WebDriver driver;
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	  public void beforeTest(String browser) {
	 
	 
	  if(browser.equalsIgnoreCase("firefox")) {
	 
		  driver = new FirefoxDriver();
	 
	 
	  }else if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		  driver = new ChromeDriver();
		
	}
	 
	  // Doesn't the browser type, lauch the Website
	 
	  driver.get("http://www.store.demoqa.com"); 
	 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  @Test 
	  public void login() throws InterruptedException {
	 
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	    driver.findElement(By.id("log")).sendKeys("testuser_1");
	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	 
	    driver.findElement(By.id("login")).click();
	 
		}  
	 
	//  @AfterClass 
	  public void afterTest() {
	 
			driver.quit();
	 
		}

}
