package com.pack1;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import junit.framework.Assert;

public class JunitExample2 {
	
	
	static WebDriver driver;
	
	
	@BeforeClass
	public static void mth1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\write\\Downloads\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	
	@Before
	public void mth2() {
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void mth3() throws InterruptedException {
		
		driver.findElement(By.id("ap_email")).sendKeys("9962651001"+Keys.ENTER);
		
		driver.findElement(By.id("ap_password")).sendKeys("yyuighjbghjg"+Keys.ENTER);
		
		
		Thread.sleep(3000);
		boolean check = driver.findElement(By.id("signInSubmit")).isDisplayed();
		
		Assert.assertEquals(true, check);
		
		
	}
	
	@AfterTest
	public void mth4() {
		
		driver.close();
		
		
	}
}
