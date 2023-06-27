package usefullMethods;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShots {
	public static void TakesScreenshot(WebDriver driver, String string) throws Exception{
		// TODO Auto-generated method stub
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("/Users/devtron/Documents/Class Training/TestAutomation/screenshots/" + string + ".png" ));
		
	}
}



	

	
	//File destFile = new File("/Users/devtron/Documents/Class Training/TestAutomation/screenshots/screenshot.png");
	//FileUtils.copyFile(scrFile,destFile);
	//FileUtils.copyFile(srcFile, destFile);
	//https://www.browserstack.com/guide/take-screenshots-in-selenium

