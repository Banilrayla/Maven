package com.testng;

import javax.management.RuntimeErrorException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_Test {
	@Test
	private void signup() {// dependency suppress the priority
		//Assert.assertTrue(false);
		System.out.println("sign Up");
	}

	@Test(dependsOnMethods = "signup")

	private void login() {
		System.out.println("login");
	}

	@Test(dependsOnMethods = "login")
	private void searchProduct() {
		
		System.out.println("search Product");

	}

	@Test(dependsOnMethods = "searchProduct")
	private void addToCart() {
		System.out.println("add To Cart");

	}
 
	@Test(dependsOnMethods = "addToCart")
	private void payment() {
		System.out.println("payment");
		//throw new RuntimeErrorException(null);

	}

	@Test(dependsOnMethods = "payment")
	private void signoff() {
		System.out.println("sign Off");
	}
}
