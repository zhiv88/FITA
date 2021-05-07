package com.pack1;

import org.testng.annotations.Test;

public class TestNGExample2 {

	
	@Test (priority=1)
	public void mth1() {
		
		System.out.println("First execution");
	}
	
	
	@Test (priority=3)
	public void mth2() {
		
		System.out.println("Third Execution");
		
		
	}
	
	@Test (priority=2)
	public void mth3() {
		
		System.out.println("Second Eecution");
	}
}
