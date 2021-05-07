package com.pack1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitExample {
	
	@BeforeClass
	public static void mth1() {
		
		System.out.println("BeforeClass");
		
	}

	@Before
	public void mth2() {
		
		System.out.println("Before");
		
	}


	@Test
	public void mth3() {
		
		System.out.println("Test 1");
		
	}


	@Test
	public void mth4() {
		
		System.out.println("Test 2");
		
	}

	@Test
	public void mth5() {
		
		System.out.println("Testb 3");
		
	}

	@After
	public void mth6() {
		
		System.out.println("After");
		
	}

	@AfterClass
	public static void mth7() {
		
		System.out.println("AfterClass");
		
	}

	@Ignore
	public void mth8() {
		
		System.out.println("This method will not be executed");
		
	}

		
		


}
