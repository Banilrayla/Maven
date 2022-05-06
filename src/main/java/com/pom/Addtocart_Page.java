package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart_Page {
public static WebDriver driver;
	
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath="(//a[@title='Casual Dresses'])[1]")
	private WebElement casual_Dress;
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement image;
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement add_cart;
	@FindBy(xpath="//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
	private WebElement proceed;
	
	
	
	
	
	
	public Addtocart_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getCasual_Dress() {
		return casual_Dress;
	}
	public WebElement getImage() {
		return image;
	}
	public WebElement getAdd_cart() {
		return add_cart;
	}
	public WebElement getProceed() {
		return proceed;
	}
	
	
	
	
}