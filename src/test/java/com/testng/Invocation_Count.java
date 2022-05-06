package com.testng;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(priority = -1)
	private void setProperty() {
		System.out.println("set property");
	}

	@Test
	private void launchBrowser() {
		System.out.println("launch browser");
	}

	@Test(invocationCount = 5, priority=-2)
	private void refresh() {
System.out.println("refresh");
	}
}
