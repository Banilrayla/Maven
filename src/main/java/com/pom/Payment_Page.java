package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	
	public static WebDriver driver;
	
	@FindBy(className="cheque")
private WebElement cheque;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;	
	public WebElement getConfirm() {
		return confirm;
	}

	public Payment_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheque() {
		return cheque;
	}







}
