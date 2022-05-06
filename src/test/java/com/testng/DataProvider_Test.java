package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class;

public class DataProvider_Test extends Base_Class {
	public void test(String sUsername,String sPassword) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Mav_Project\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		implicitWait(driver,30);
		get(driver,"https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys(sUsername);
		driver.findElement(By.name("txtPassword")).sendKeys(sPassword);
		driver.findElement(By.name("Submit")).click();
		

	}

	}
