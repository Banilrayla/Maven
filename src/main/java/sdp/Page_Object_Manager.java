package sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Address_Page;
import com.pom.Addtocart_Page;
import com.pom.Homepage;
import com.pom.Login_Page;
import com.pom.Payment_Page;
import com.pom.Shipping_Page;
import com.pom.Summary_Page;

public class Page_Object_Manager {

	public static WebDriver driver;
	// private variables refName----pojo
	// private webElement refName----pom
	// private object refName-----page object manager

	private Homepage hp;
	private Login_Page lp;
	private Addtocart_Page ap;
	private Summary_Page sp;
	private Address_Page as;
	private Shipping_Page sh;
	private Payment_Page pp;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Homepage getInstanceHp() {
		hp = new Homepage(driver);
		return hp;
	}

	public Login_Page getInstanceLp() {
		lp = new Login_Page(driver);
		return lp;
	}

	public Addtocart_Page getInstanceAp() { // getInstanceAp---ctrl + spacebar
		ap = new Addtocart_Page(driver);
		return ap;
	}

	public Summary_Page getInstancSp() {
		sp = new Summary_Page(driver);
		return sp;
	}

	public Address_Page getInstanceAs() {
		as = new Address_Page(driver);
		return as;
	}

	public Shipping_Page getInstanceSh() {
		sh = new Shipping_Page(driver);
		return sh;
	}

	public Payment_Page getInstancePp() {
		pp = new Payment_Page(driver);
		return pp;
	}

}
