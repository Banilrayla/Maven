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
public class PomRunner extends Base_Class {
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Homepage hp = new Homepage(driver);
	public static Login_Page lp = new Login_Page(driver);
	public static Addtocart_Page ap = new Addtocart_Page(driver);
	public static Summary_Page sp = new Summary_Page(driver);
	public static Address_Page as = new Address_Page(driver);
	public static Shipping_Page sh = new Shipping_Page(driver);
	public static Payment_Page pp = new Payment_Page(driver);
	public static void main(String[] args) throws IOException, InterruptedException {
		get(driver,"http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		implicitWait(driver, 60);
		clickOnElement(hp.getSignIn());
		inputValueElement(lp.getEmail(), "benil.christian@gmail.com");
		inputValueElement(lp.getPassword(), "lee6014brett");
		clickOnElement(lp.getLogin());
		moveElement(driver, ap.getWomen());
		moveElement(driver, ap.getCasual_Dress());
		clickOnElement(ap.getCasual_Dress());
		moveElement(driver, ap.getImage());
		moveElement(driver, ap.getAdd_cart());
		click(driver, ap.getAdd_cart());
		clickOnElement(ap.getProceed());
		clickOnElement(sp.getAdd1());
		clickOnElement(sp.getAdd2());
		scrollDown("window.scrollBy(0,1000)");
		clickOnElement(sp.getCheckout());
		clickOnElement(as.getAddress());
		clickOnElement(sh.getCheckbox());
		clickOnElement(sh.getCarrier());
		clickOnElement(pp.getCheque());
		clickOnElement(pp.getConfirm());
		scrollDown("window.scrollBy(0,400)");
		captureScreenShot(driver, "C:\\Users\\welcome\\eclipse-workspace\\Mav_Project\\ScreenShot\\pom.png");

	}

}
