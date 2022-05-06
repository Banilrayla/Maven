package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {
	public static WebDriver driver;
	@FindBy(name="processAddress")
	private WebElement address;

	public Address_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddress() {
		return address;
	}
	

}
