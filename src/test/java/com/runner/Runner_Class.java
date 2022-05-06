package com.runner;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Runner_Class {
	public static void main(String[] args) throws InterruptedException, IOException {

		//System.setProperty("webdriver.chrome.driver",
				//"C:\Users\welcome\eclipse-workspace\Mav_Project\Chrome\chromedriver_win32\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+
				"\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Actions builder = new Actions(driver);
//		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
//		builder.moveToElement(women).build().perform();
//		WebElement casual_Dresses = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
//		builder.moveToElement(casual_Dresses).build().perform();
//		builder.click().build().perform();
//		JavascriptExecutor js = (JavascriptExecutor) driver;		
//		js.executeScript("window.scrollBy(0,800)");
//	
//		WebElement image = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
//		builder.moveToElement(image).build().perform();
//		WebElement add_Cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
//		builder.moveToElement(add_Cart).build().perform();
//		builder.click().build().perform();
//		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
//		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
//		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
//
//		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		WebElement sigIn = driver.findElement(By.xpath( "//a[@class='login']"));
		sigIn.click();
		WebElement email=	driver.findElement(By.id("email"));
				email.sendKeys("gladbeni@gmail.com");
				WebElement password=driver.findElement(By.id("passwd"));
				password.sendKeys("123cd");
				WebElement login=	driver.findElement(By.id("SubmitLogin"));
		        login.click();
		
//		driver.findElement(By.xpath("(//div[@class='radio'])[2]")).click();
//		driver.findElement(By.id("customer_firstname")).sendKeys("Banil");
//		driver.findElement(By.id("customer_lastname")).sendKeys("Rayla");
//		driver.findElement(By.id("passwd")).sendKeys("123cd");
//
//		WebElement day = driver.findElement(By.id("days"));
//		Select s = new Select(day);
//		s.selectByValue("1");
//		WebElement month = driver.findElement(By.id("months"));
//		Select s1 = new Select(month);
//		s1.selectByIndex(1);
//		WebElement year = driver.findElement(By.id("years"));
//		Select s2 = new Select(year);
//		s2.selectByIndex(1);
//		driver.findElement(By.id("uniform-newsletter")).click();
//		driver.findElement(By.id("company")).sendKeys("Testing");
//		driver.findElement(By.id("address1")).sendKeys("18 maadi Degla");
//		driver.findElement(By.id("address2")).sendKeys("maadi");
//		driver.findElement(By.id("city")).sendKeys("cairo");
//		WebElement state = driver.findElement(By.id("id_state"));
//		Select s3 = new Select(state);
//		s3.selectByIndex(10);
//		driver.findElement(By.id("postcode")).sendKeys("11728");
//		WebElement country = driver.findElement(By.id("id_state"));
//		Select s4 = new Select(country);
//		s4.selectByValue("2");
//		driver.findElement(By.id("phone")).sendKeys("1000000000");
//		driver.findElement(By.id("submitAccount")).click();
	//	WebElement order=driver.findElement(By.id("order"));
	//	order.click();
		
		       
		     
		      Actions a= new Actions(driver);
		      WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
				a.moveToElement(women).build().perform();
		      WebElement casual_Dress = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		      a.moveToElement(casual_Dress).build().perform();
		      a.click().build().perform();
		      JavascriptExecutor js = (JavascriptExecutor) driver;		
				js.executeScript("window.scrollBy(0,800)");
				WebElement image = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
				a.moveToElement(image).build().perform();
				WebElement add_Cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
				a.moveToElement(add_Cart).build().perform();
				a.click().build().perform();
			WebElement proceed=	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]"));
				proceed.click();
					
				WebElement add1=driver.findElement(By.xpath("//i[@class='icon-plus']"));
				add1.click();
				WebElement add2= driver.findElement(By.xpath("//i[@class='icon-plus']"));
				add2.click();
				WebElement checkout=driver.findElement(By.xpath("//a[contains(@class,'button btn')]//span[1]"));
				checkout.click();
		        
		        
		        
		        
	WebElement address=	driver.findElement(By.name("processAddress"));
		address.click();
		
		
		
		
		WebElement checkbox = driver.findElement(By.id("cgv"));
		checkbox.click();
	WebElement carrier = driver.findElement(By.name("processCarrier"));
	carrier.click();
	
	
	
		WebElement cheque = driver.findElement(By.className("cheque"));
		cheque.click();
		
		
		
		
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();
//      JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollBy(0,400)");	
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\welcome\\eclipse-workspace\\Mav_Project\\ScreenShot\\shot.png");
//		FileUtils.copyFile(source, destination);

	}
}