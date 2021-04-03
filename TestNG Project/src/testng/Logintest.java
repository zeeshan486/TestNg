package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	public static ExtentReports extent;
	public static ExtentTest test,test1;
	public static FirefoxDriver driver;
	public static Screenshot screen = new Screenshot();
	@BeforeTest
	public void beforetest() {
		extent = new ExtentReports("./report/extentreport.html");
		test = extent.startTest("test pass");
	}
	@Test
	public void test1() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option = new FirefoxOptions();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("elementshot");
		String imagepath = screen.screencapture(driver, "fullscreen");
		String imagepath1  = test.addScreenCapture(imagepath);
		test.log(LogStatus.PASS, "screencapture" + imagepath1);
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void test2() {
		System.out.println("test2");
		test.log(LogStatus.INFO, "test2 is success");
	}
	
	@AfterTest
	public void aftertest() {
		extent.flush();
	}

}
