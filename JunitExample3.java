package com.pack1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitExample3 {
	
	
	@BeforeClass
	public static  void mth1() {
		
		System.out.println("Third Class of Junit");
	}

	@Test
	public void mth2() {
		
		System.out.println("Test method of Third class");
	}
	
	@AfterClass
	public static void mth3() {
		
		System.out.println("Bye");
	}
}
