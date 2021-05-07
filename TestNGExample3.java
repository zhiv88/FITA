package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGExample3 {
	
	WebDriver driver;
	
	
	@BeforeSuite
	public void mth1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\write\\Downloads\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

	}
	
	
	@Test
	public void mth2() {
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
	}
	
	
	@Test
	public void mth3() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(""+Keys.ESCAPE);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	}
	
	@Test
	public void mth4() {
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Selenium - Google Search");
	}
	
	
	@AfterSuite
	public void mth5() {
		
		//driver.close();
	}

}
