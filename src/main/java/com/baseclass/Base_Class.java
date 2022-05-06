package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;
	public static String value;

	// get browser
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Chrome\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		return driver;

	}
	
	
	

	// Click
	public static void clickOnElement(WebElement element) {
		element.click();

	}

	// Send keys
	public static void inputValueElement(WebElement element, String value) {
		element.click();
		element.clear();
		element.sendKeys(value);

	}

	// Close
	public static void close() {
		driver.close();
	}

	// quit
	public static void quit() {
		driver.quit();
	}

	// Select
	public static void dropDowm(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byValue")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		}

	}

	// isMultiple
	public static void isMulti(WebElement element) {
		Select s = new Select(element);
		System.out.println(s.isMultiple());
	}

	// allSelectedOptions
	public static void allSelect(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byValue")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement1 : allSelectedOptions) {
			System.out.println("Get all Selected option:" + webElement1.getText());
		}
	}

	// getFirstOptions
	public static void getFirst(WebElement element) {
		Select s = new Select(element);

		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("Get first Selected option:" + firstSelectedOption.getText());
		System.out.println("-------------------------");

	}

	// getOptions
	public static void getOptions(WebElement element) {
		Select s = new Select(element);

		List<WebElement> options = s.getOptions();

		for (WebElement webElement : options) {
			System.out.println("Get the options:" + webElement.getText());

		}
	}

//get
	public static void get(WebDriver driver, String arg) {
		driver.manage().window().maximize();
		driver.get(arg);
		driver.manage().window().maximize();
	}
//navigation 	

	public static void navigateTo(WebDriver driver, String arg) {
		driver.navigate().to(arg);
	}

	public static void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}

	public static void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}

	public static void navigateRefresh(WebDriver driver) {

		driver.navigate().refresh();
	}

	// getcurrenturl
	public static String fetchUrl(String ne) {
		driver.getCurrentUrl();
		System.out.println(ne);
		return ne;

	}

//getTitle
	public static String getName(WebDriver driver, String title) {

		System.out.println(driver.getTitle());

		return driver.getTitle();
	}

//getAttribute
	public static String fetchAttributes(WebElement element, String value) {

		System.out.println(element.getAttribute(value));
		return value;
	}

//isEnabled
	public static void enable(WebElement element) {
		System.out.println(element.isEnabled());
		return;
	}

//isDisplayed
	public static void isDisplay(WebElement element) {
		System.out.println(element.isDisplayed());
		return;

	}
//wait

//Implicitwait

	public static void implicitWait(WebDriver driver, int duration) {

		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		return;

	}

//action
	public static void moveElement(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();

	}

	public static void contextClik(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();

	}

	public static void doubleClik(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}

	public static void click(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();

	}

	public static void releas(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.release(element).build().perform();

	}
//explicit

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();

	}		
	// Screenshot
	public static void captureScreenShot(WebDriver driver,String s) throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		File destination = new File(s);
		FileUtils.copyFile(source, destination);
	}

	// checkBox
	public static void check(WebElement element) {
		System.out.println(element.isSelected());
		return;
	}

	// radio

	public static void radio(WebElement element) {
		element.click();
    	System.out.println(element.isSelected());

	}

	// windowhand
	public static void window(WebDriver driver, String name) {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		System.out.println(driver.getTitle());
	}

	// window handles
	public static void windowhandls(WebDriver driver, String name) {

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list = new ArrayList<String>(windowHandles);
		for (String string : list) {
			System.out.println(string);
			System.out.println(driver.switchTo().window(string).getTitle());
				}

	}

	// Robo
	public static void robo(WebDriver driver, WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// simpleAlert
	public static void simple(WebDriver driver, String value) {
		if (value.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		}
	}
	// confirmAlert
	public static void confirm(WebDriver driver, String value) {
		if (value.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (value.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		}
	}
	// promptAlert
	public static void prompt(WebDriver driver, String value, String type) {
		Alert alertwindow = driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		alertwindow.sendKeys(value);
		alertwindow.accept();
	}
	//getText
	public static void getText(WebElement element) {
		element.getText();
		System.out.println(element.getText());
	}
		// Frames
	public static void singleFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
//multiFrame
	public static void Multi(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	// java script executor
	public static void scrollDown(String s) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(s);
	}


	public static void scrollUp(String s1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(s1);
	}
	
	public static void scroll(String s2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(s2);
	}

	public static void jsClickElement(String s, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollintoview()", element);
	}

	
	
	
	
	
	

	   public static String read_Excel(String path,int sheet_Index,int row_Index, int cell_Index) throws IOException {
		File f= new File(path);
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(sheet_Index);
		Row row = sheetAt.getRow(row_Index);
		Cell cell = row.getCell(cell_Index);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		}
		else if(cellType.equals(CellType.NUMERIC)){
			 double numericCellValue = cell.getNumericCellValue();
			int data= (int) numericCellValue;
			value= String.valueOf(data);
		}
		
		
		return value;
	}
}























//
////fluent
//	public static void fluentWait(long time1, long time2) throws InterruptedException {
//
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//
//				.withTimeout(Duration.ofSeconds(time1))
//
//				.pollingEvery(Duration.ofSeconds(time2))//
//				.ignoring(NoSuchElementException.class);
