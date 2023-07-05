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
import pageObjectModels.LoginPage;
import testData.DataFile;
import usefullMethods.ScreenShots;

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
public  void functionalityToTest() throws Exception {
	
	Navigation.loginLink(driver).click();
	Assert.assertEquals(DataFile.loginPageURL, driver.getCurrentUrl());
	ScreenShots.TakesScreenshot(driver, "Login Page");
	
	LoginPage.emailField(driver).sendKeys(DataFile.userEmail);
	Assert.assertEquals(DataFile.userEmail, LoginPage.emailField(driver).getAttribute("value"));
	
	LoginPage.passwordField(driver).sendKeys(DataFile.userPassword);
	Assert.assertEquals(DataFile.userPassword, LoginPage.passwordField(driver).getAttribute("value"));
	
	LoginPage.keepMeLoggedCheckBox(driver).click();
	Assert.assertTrue(LoginPage.keepMeLoggedCheckBox(driver).isSelected());
	
	LoginPage.logInButton(driver).click();
	Assert.assertTrue(LoginPage.errorSummary(driver).isDisplayed());
	
	
	

}

@After
public void tearDown() {
	//driver.quit();
}

}