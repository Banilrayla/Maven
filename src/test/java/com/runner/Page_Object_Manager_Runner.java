package com.runner;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.baseclass.Base_Class;
import com.pom.Address_Page;
import com.pom.Addtocart_Page;
import com.pom.Homepage;
import com.pom.Login_Page;
import com.pom.Payment_Page;
import com.pom.Shipping_Page;
import com.pom.Summary_Page;

import sdp.Page_Object_Manager;
public class Page_Object_Manager_Runner extends Base_Class {
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Page_Object_Manager pom= new Page_Object_Manager(driver);
		public static void main(String[] args) throws IOException, InterruptedException {
		get(driver, "http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		implicitWait(driver,60);
		clickOnElement(pom.getInstanceHp().getSignIn());
		inputValueElement(pom.getInstanceLp().getEmail(),"benil.christian@gmail.com");
		inputValueElement(pom.getInstanceLp().getPassword(),"lee6014brett");
		clickOnElement(pom.getInstanceLp().getLogin());
		moveElement(driver,pom.getInstanceAp().getWomen());
		moveElement(driver, pom.getInstanceAp().getCasual_Dress());
		clickOnElement(pom.getInstanceAp().getCasual_Dress());
		moveElement(driver,pom.getInstanceAp().getImage());
		moveElement( driver,pom.getInstanceAp().getAdd_cart());
		click(driver,pom.getInstanceAp().getAdd_cart());
		clickOnElement(pom.getInstanceAp().getProceed());
		clickOnElement(pom.getInstancSp().getAdd1());
		clickOnElement(pom.getInstancSp().getAdd2());
		scrollDown("window.scrollBy(0,1000)");
		clickOnElement(pom.getInstancSp().getCheckout());
		clickOnElement(pom.getInstanceAs().getAddress());
		clickOnElement(pom.getInstanceSh().getCheckbox());
		clickOnElement(pom.getInstanceSh().getCarrier());
		clickOnElement(pom.getInstancePp().getCheque());
		clickOnElement(pom.getInstancePp().getConfirm());
		scrollDown("window.scrollBy(0,400)");
		captureScreenShot( driver,"C:\\Users\\welcome\\eclipse-workspace\\Mav_Project\\ScreenShot\\page_manager.png");

	}

}


