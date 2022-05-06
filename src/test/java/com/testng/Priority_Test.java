package com.testng;


import org.testng.annotations.Test;

public class Priority_Test {
	

	

@Test(priority= -2)

private void setproperty() {
		System.out.println("setproperty");

	}
	
		@Test(priority= -5)
	private void launchbrowser() {
		System.out.println("launchbrowser");
	}
	
		@Test(priority= 5)
	private void login() {
		System.out.println("login");
	}
		
		@Test
		private void geturl() {
			System.out.println("geturl");

		}
		

}
