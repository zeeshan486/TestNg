package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {
	
	public String screencapture(WebDriver driver,String imagename) throws Exception {
		
		TakesScreenshot screen = ((TakesScreenshot)driver);
		File srcFile = screen.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screen/" + imagename + ".png");
		String destFile = destination.getAbsolutePath();
		FileUtils.copyFile(srcFile, destination);
		return destFile;
		
	}
public String elementcapture(WebDriver driver,WebElement element,String filename) throws Exception {
		
		File srcFile = element.getScreenshotAs(OutputType.FILE);
	    File destination = new File("./screen/" + filename + ".png");
	    String distfilepath = destination.getAbsolutePath();
		FileUtils.copyFile(srcFile, destination);
	
		return distfilepath;
	}
	
	
	
	

}
