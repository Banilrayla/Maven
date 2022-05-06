package com.runner;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.baseclass.Base_Class;

import sdp.Page_Object_Manager;
public class ExcelRunner extends Base_Class {
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		get(driver, "http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Page_Object_Manager pom= new Page_Object_Manager(driver);
		implicitWait(driver,60);
		clickOnElement(pom.getInstanceHp().getSignIn());
		String username = read_Excel("C:\\Users\\welcome\\eclipse-workspace\\Mav_Project\\Excel\\automation.xlsx", 0, 1, 0);
		inputValueElement(pom.getInstanceLp().getEmail(),username);
		String password = read_Excel("C:\\Users\\welcome\\eclipse-workspace\\Mav_Project\\Excel\\automation.xlsx", 0, 1, 1);
		inputValueElement(pom.getInstanceLp().getPassword(),password);
		clickOnElement(pom.getInstanceLp().getLogin());
//		moveElement(driver,pom.getInstanceAp().getWomen());
//		moveElement(driver, pom.getInstanceAp().getCasual_Dress());
//		clickOnElement(pom.getInstanceAp().getCasual_Dress());
//		moveElement(driver,pom.getInstanceAp().getImage());
//		moveElement( driver,pom.getInstanceAp().getAdd_cart());
//		click(driver,pom.getInstanceAp().getAdd_cart());
//		clickOnElement(pom.getInstanceAp().getProceed());
//		clickOnElement(pom.getInstancSp().getAdd1());
//		clickOnElement(pom.getInstancSp().getAdd2());
//		scrollDown("window.scrollBy(0,1000)");
//		clickOnElement(pom.getInstancSp().getCheckout());
//		clickOnElement(pom.getInstanceAs().getAddress());
//		clickOnElement(pom.getInstanceSh().getCheckbox());
//		clickOnElement(pom.getInstanceSh().getCarrier());
//		clickOnElement(pom.getInstancePp().getCheque());
//		clickOnElement(pom.getInstancePp().getConfirm());
//		scrollDown("window.scrollBy(0,400)");
//		captureScreenShot( driver,"C:\\Users\\welcome\\eclipse-workspace\\Mav_Project\\ScreenShot\\page_manager.png");

	}

}
