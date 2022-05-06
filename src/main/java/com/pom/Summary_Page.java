package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
public static WebDriver driver;
	
	@FindBy (xpath="//i[@class='icon-plus']")
	private WebElement add1;
	@FindBy (xpath="//i[@class='icon-plus']")
	private WebElement add2;
	@FindBy (xpath="//a[contains(@class,'button btn')]//span[1]")
	private WebElement checkout;
	public Summary_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAdd1() {
		return add1;
	}
	public WebElement getAdd2() {
		return add2;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	
}
