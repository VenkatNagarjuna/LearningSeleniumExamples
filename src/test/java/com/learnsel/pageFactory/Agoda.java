package com.learnsel.pageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Agoda {
	
	
	WebDriver driver;
	
	@Test
	public void agodaTest(){
		
		driver = new FirefoxDriver();
		driver.get("http://www.agoda.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-target='#tab-flight']")).click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='kayakWidgetLayout']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");
		
		driver.findElement(By.xpath("//div[@class='flightsRoundTrip']//input[2]")).sendKeys("Hyderbad");
		
		WebElement departure = driver.findElement(By.xpath("//div[@class='flightsRoundTrip']/input[3]"));
		
		departure.sendKeys("Wed 06/01");

		
		WebElement arrive = driver.findElement(By.xpath("//div[@class='flightsRoundTrip']/input[4]"));
		
		arrive.sendKeys("Fri 06/10");
		
		driver.findElement(By.className("searchButton flightsSearch")).click();
		System.out.println("sample test");
	}
	
	public void selectMonth(String month){
		
	WebElement webElement	= driver.findElement(By.className("pika-select pika-select-month"));
	
	 Select select = new Select(webElement);
	 select.selectByVisibleText(month);
	
	}
	
	private void selectStartDate(String date){
		
		List<WebElement> colm = driver.findElements(By.tagName("td"));
		
		for (WebElement dates : colm) {
			
			if(dates.getText().contains(date)){
				
			}
		}
	}

}
