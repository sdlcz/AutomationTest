package testSuite;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverUtilities.DriverUtilities;
import pageObjectModels.Navigation;
import testData.DataFile;

public class testCase4 {
WebDriver driver;
	
@Before
public void preConditions() {
	DriverUtilities myDriverUtilities = new DriverUtilities();
	driver = myDriverUtilities.getDriver();
	driver.manage().window().maximize();
	driver.get("https://www.prospects.ac.uk/");
	
}

@Test
public  void functionalityToTest() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	Navigation.loginLink(driver).click();
	Assert.assertEquals(DataFile.loginPageURL, driver.getCurrentUrl());
	
	
	
	
	

}

@After
public void tearDown() {
	driver.quit();
}

}