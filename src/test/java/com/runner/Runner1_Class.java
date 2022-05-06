package com.runner;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.baseclass.Base_Class;

public class Runner1_Class extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		driver = getBrowser("chrome");
	
		
		 get(driver,"https://www.amazon.in/");
		 
		
//		scrollDown("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//        scrollUp("window.scrollBy(0,-500)");
//Thread.sleep(2000);
//scroll("window.scroll(0,0)");
//WebElement mobile = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
//jsClickElement("arguments[0].click()", mobile);

//		Fluent wait
		
//		get(driver,"http://www.facebook.com");
//		clickOnElement(driver.findElement(By.linkText("Create New Account")));
//		fluentWait(10,1);
//		inputValueElement(driver.findElement(By.id("foo")),"banil");
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//frames
//		get(driver,"http://demo.automationtesting.in/Frames.html");
//		WebElement multi = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		clickOnElement(multi);
//		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//		clickOnElement(outerframe);
//		Multi(driver, outerframe);
//		WebElement inner = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/iframe[1]"));
//			singleFrame(driver,inner );
//		inputValueElement(driver.findElement(By.xpath("//input[@type='text']")),"Java");
//		
//navigation
		
		//get(driver,"http://www.facebook.com");
		// get(driver,"http://www.google.com");
		//
		// navigateBack(driver);	
		// navigateForward(driver);		
			
		
		
		//get(driver, "https://www.flipkart.com/?ef_id=c37a3d9x4d735131265d65fdb9b85a7e0:G:s&s_kwcid=AL!739!10!76347474199615!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
//		clickOnElement(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
//		

//		
//		
//		
//	imlicit
//		implicitWait(driver, 50);
		//scrolldown
//get(driver,"https://www.amazon.in/");
 //scrollDown(0, 1000);
		
		
		//scrollIntoView
		
// WebElement smartWatch = driver.findElement(By.xpath("(//img[@class='product-image'])[76]"));
	
// scrollIntoView(smartWatch);
////		implicitWait(driver, 50);
////
//	get(driver, "http://demo.automationtesting.in/Frames.html");
//
//		WebElement single = driver.findElement(By.id("singleframe"));
//		clickOnElement(single);
//		
//		singleFrame(driver, "Java");

////		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
////		inputValueElement(text, "Java");
//
//	}
//}
//
//// WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
//		
//		text.sendKeys("Java");

//         Thread.sleep(2000);
/// get(driver,"http://demo.automationtesting.in/Frames.html");

// 
		
// captureScreenShot(driver);
		
//		ge(driver,"http://demo.automationtesting.in/Alerts.html");
//		clickOnElement(driver.findElement(By.xpath("(//a[@class='analystic'])[3]")));
//		Thread.sleep(3000);
//		clickOnElement(driver.findElement(By.xpath("//button[@class='btn btn-info']")));
//		Thread.sleep(3000);
//		prompt(driver,"", "ok");
//		Thread.sleep(3000);
//		getText(driver.findElement(By.id("demo1")));
//		
//		clickOnElement(driver.findElement(By.xpath("//button[@class='btn btn-info']")));
//		Thread.sleep(3000);
//
//		
////		inputValueElement(driver.findElement(By.xpath("//button[@class='btn btn-info']")),"Banil");
////		Thread.sleep(3000);
//		
//		
//		prompt(driver,"Banil","ok");
//		Thread.sleep(3000);
//	
//		getText(driver.findElement(By.id("demo1")));
//		Thread.sleep(3000);

//		
//	System.out.println(driver.switchTo().alert().getText());
//	driver.switchTo().alert().sendKeys("Banil");
//		driver.switchTo().alert().accept();
//		WebElement text = driver.findElement(By.id("demo1"));
//		System.out.println(text.getText());
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().sendKeys("Banil");
//			driver.switchTo().alert().accept();
//			WebElement text = driver.findElement(By.id("demo1"));
//			System.out.println(text.getText());
// getText(driver.findElement(By.xpath("//button[@class='btn btn-info']")));
// clickOnElement(driver.findElement(By.id("demo1")));

// getText(driver.findElement(By.xpath("//button[@class='btn btn-info']")));
//		Thread.sleep(3000);
//		inputValueElement(driver.findElement(By.xpath("//button[@class='btn btn-info']")),"beni");
//		Thread.sleep(3000);
// getText(driver.findElement(By.id("demo1")));

// prompt(driver,driver.findElement(By.xpath("//button[@class='btn
// btn-info']")),"Banil");
// getText(driver.findElement(By.xpath("//button[@class='btn btn-info']")));
// Thread.sleep(3000);
// inputValueElement(driver.findElement(By.xpath("//button[@class='btn
// btn-info']")),"Banil");
// getText(driver.findElement(By.xpath("//button[@class='btn btn-info']")));
//		
//		prompt(driver,driver.findElement(By.xpath("//button[@class='btn btn-info']")),"Banil");
//		Thread.sleep(3000);
//		getText(driver.findElement(By.id("demo1")));
//		Thread.sleep(3000);
// clickOnElement(driver.findElement(By.xpath("(//a[@class='analystic'])[2]")));
//		Thread.sleep(5000);
//		clickOnElement(driver.findElement(By.xpath("//button[@class='btn btn-primary']")));
//		confirm(driver,"ok");
//		Thread.sleep(5000);
// ge(driver,"https://www.amazon.in/");
//
//

		// simple
		// get(driver,"http://demo.automationtesting.in/Alerts.html");
//WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
//clickOnElement(simple);
// simple(driver,"ok");
// Thread.sleep(8000);

		// confirm
//		get(driver,"http://demo.automationtesting.in/Alerts.html");
//		clickOnElement(driver.findElement(By.xpath("(//a[@class='analystic'])[2]")));
//	Thread.sleep(5000);
//		clickOnElement(driver.findElement(By.xpath("//button[@class='btn btn-primary']")));
//		confirm(driver,"ok");

		// prompt
//		get(driver, "http://demo.automationtesting.in/Alerts.html");
//		clickOnElement(driver.findElement(By.xpath("(//a[@class='analystic'])[3]")));
//		Thread.sleep(5000);
//		clickOnElement(driver.findElement(By.xpath("//button[@class='btn btn-info']")));
//		prompt(driver, "Banil", "ok");

		// clickOnElement( driver.findElement(By.xpath("//button[@class='btn
		// btn-info']")));
		// inputValueElement( driver.findElement(By.xpath("//button[@class='btn
		// btn-info']")),"Banil");

		// inputValueElement( driver.findElement(By.xpath("//button[@class='btn
		// btn-info']")),"Banil");

	

// ge(driver,"http://demo.automationtesting.in/Alerts.html");

//get(driver, "https://www.flipkart.com/?ef_id=c37a3d9x4d735131265d65fdb9b85a7e0:G:s&s_kwcid=AL!739!10!76347474199615!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
//clickOnElement(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
//contextClik(driver,driver.findElement(By.xpath("//div[@class='xtXmba']")));
//robo(driver, driver.findElement(By.xpath("//div[@class='xtXmba']")));
//
//contextClik(driver,driver.findElement(By.linkText("Grocery")));
//robo(driver,driver.findElement(By.linkText("Grocery")));
//contextClik(driver,driver.findElement(By.linkText("Travel")));
//robo(driver,driver.findElement(By.linkText("Grocery")));
//windowhandls(driver,"https://www.flipkart.com/?ef_id=c37a3d94d735131265d65fdb9b85a7e0:G:s&s_kwcid=AL!739!10!76347474199615!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
// window(driver,"http://leafground.com/pages/radio.html");
// radio(driver.findElement(By.xpath("//input[@id='no']")));
// check(driver.findElement(By.xpath("(//div[@class='example']//input)[1]")));
// clickOnElement(driver.findElement(By.xpath("//a[contains (text(),'Create New
// Account')]")));
// fluentWait(driver,driver.findElement(By.xpath("//a[contains (text(),'Create
// New Account')]")));
// driver.findElement(By.name("firstname")).sendKeys("Banil");
// clickOnElement(driver.findElement(By.xpath("//a[contains (text(),'Create New
// Account')]")));
// clickOn(driver,driver.findElement(By.xpath("//a[contains (text(),'Create New
// Account')]")) ,50);

// WebElement ab=driver.findElement(By.name("firstname"));
// inputValueElement(ab,"Banil");
// ge(driver, "https://www.amazon.in/");

// contextClik(driver, driver.findElement(By.linkText("Best Sellers")));
// moveElement(driver,driver.findElement(By.linkText("Best Sellers")));
// doubleClik(driver,driver.findElement(By.linkText("Best Sellers")));
// clikHold(driver,driver.findElement(By.linkText("Best Sellers")));
// releas(driver,driver.findElement(By.linkText("Best Sellers")));

// ge(driver, ("http://www.facebook.com"));
//		clickOnElement(driver.findElement(By.xpath("//a[contains	(text(),'Create New Account')]")));
//		ExplicitWait(driver,20);
//		WebElement ab=driver.findElement(By.name("firstname"));
//		inputValueElement(ab,"banil");

//// WebElement fName = driver.findElement(By.name("firstname"));
// fName.sendKeys("Banil");

//		clickOnElement(driver.findElement(By.xpath("//a[contains	(text(),'Create New Account')]")));
//////////////////////
//		WebElement ab=driver.findElement(By.name("firstname"));
//		inputValueElement(ab,"banil");

// ge(driver, ("http://leafground.com/pages/Dropdown.html"));
//			WebElement first = driver.findElement(By.xpath("(//select)[6]"));
//          getFirst(first );

// getOptions
// WebElement getOpt = driver.findElement(By.xpath("(//select)[6]"));
// getOptions(getOpt);

// WebElement multi= driver.findElement(By.xpath("(//select)[6]"));
// isMulti(multi);

// WebElement allSel = driver.findElement(By.xpath("(//select)[6]"));
// allSelect(allSel, "byValue", "1");
// allSelect(allSel,"byIndex","2");
// allSelect(allSel,"byVisibleText","Loadrunner");

// ge(driver, "http://automationpractice.com/index.php");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);							
//            WebElement signIn = driver.findElement(By.className("login"));
//			clickOnElement(signIn);
// WebElement email = driver.findElement(By.id("email"));
//			inputValueElement(email,"gladbeni@gmail.com");
//			WebElement pass = driver.findElement(By.id("passwd"));
//			inputValueElement(pass,"123cd");
// dropDowm(email, "byValue","3" );
//			WebElement signIn_Button = driver.findElement(By.id("SubmitLogin"));
//			signIn_Button.click();
//			Thread.sleep(1000);
//			navigateTo(driver, "https://www.google.com/");
//		    navigateBack(driver, "http://automationpractice.com/index.php");
//			navigateForward(driver, "https://www.google.com/");
//			Thread.sleep(3000);
//			navigateRefresh(driver);
//			navigateTo(driver, "https://www.google.com/");
			//fetchUrl("https://www.google.com/");
			
			}}
			
			
			//getName( driver, "https://www.google.com/");
//			WebElement element = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
//			fetchAttributes(element, "name");
//			WebElement ele = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
//			enable(ele);
//			WebElement elem = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
//			isDisplay(elem);
