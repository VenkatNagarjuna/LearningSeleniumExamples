package com.learnsel.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	
	WebDriver driver;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;
	
	
@BeforeTest
public void beforeTest(){
	
	
	driver = new FirefoxDriver();
	driver.get("http://www.amazon.in/");
	PageFactory.initElements(driver, this);
	
}

@Test
public void test(){
	searchBox.sendKeys("Moto g");
	searchBox.sendKeys("");
}

}
