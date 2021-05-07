package com.pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample1 {
	
	

	@BeforeClass
	public void mth3() {
		
		System.out.println("BeforeClass");
	}
	
	
	@AfterSuite
	public void mth11() {
		System.out.println("AfterSuite");
	}
	
	
	@BeforeTest
	public void mth2() {
		
		System.out.println("BeforeTest");
	}
	

	@BeforeSuite
	public void mth1() {
		System.out.println("BeforeSuite");
	}
	
	
	@BeforeMethod 
	public void mth4() {
		
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void mth5() {
		
		System.out.println("Test 1");
	}
	
	@Test
	public void mth6() {
		System.out.println("Test 2");
	}
	
	@Test
	public void mth7() {
		System.out.println("Test 3");
	}
	
	
	@AfterMethod
	public void mth8() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void mth9() {
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void mth10() {
		System.out.println("AfterTest");
	}
	
	

}
