package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	public static WebDriver driver;
public Shipping_Page(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
	}
public static WebDriver getDriver() {
	return driver;
}
public WebElement getCheckbox() {
	return checkbox;
}
public WebElement getCarrier() {
	return carrier;
}
@FindBy(id="cgv")
	private WebElement checkbox;
@FindBy(name="processCarrier")

	private WebElement carrier;
}
