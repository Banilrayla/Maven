package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	private void setproperty() {
		System.out.println("setproperty");

	}
	
		@BeforeTest
	private void launchbrowser() {
		System.out.println("launchbrowser");
	}
	@BeforeClass
	private void geturl() {
		System.out.println("geturl");

	}
	

	
	@BeforeMethod
	private void signin() {
		System.out.println("signin");
	}
		
	@Test
	private void women() {
	System.out.println("women");
	}
       @Test
  private void tshirt() {
	System.out.println("tshirt");

}
	@Test
	private void dresses() {
		System.out.println("dresses");
	}
	
	@AfterMethod
	private void signoff() {
		System.out.println("signoff");

	}
	@AfterClass
	private void homepage() {
		System.out.println("homepage");
		
			}
	
@AfterTest
private void close() {
	System.out.println("close");
}

@AfterSuite
private void deletecookies() {
	System.out.println("deletecookies");

}







}
