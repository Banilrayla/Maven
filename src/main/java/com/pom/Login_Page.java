package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public static WebDriver driver;
@FindBy(id="email")
private WebElement email;
@FindBy(id="passwd")
private WebElement password;
@FindBy(id="SubmitLogin")
private WebElement login;
public Login_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
	
	
}
