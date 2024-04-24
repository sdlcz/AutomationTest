package testSuite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverUtilities.DriverUtilities;
import testData.DataFile;
import usefullMethods.ScreenShots;
import pageObjectModels.HomePage;
import pageObjectModels.RegistrationPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testCase1 {
WebDriver driver;
//	
	@Before
	public void preConditions() {
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.manage().window().maximize();
		driver.get(DataFile.homePageURL);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	


	@Test
	
	public  void functionalityToTest() throws Exception {
		//HomePage.searchButton(driver).click();
		//HomePage.careersAdviceLink(driver).click();
		//HomePage.getingAJobLink(driver).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.equals(driver.getCurrentUrl());
		//Assert.assertEquals(DataFile.gettingAJobPageURL, driver.getCurrentUrl());
		
		driver.get(DataFile.registrationPageURL);
		Assert.assertEquals(DataFile.registrationPageURL, driver.getCurrentUrl());
		Assert.assertEquals(DataFile.registrationPageHeading, RegistrationPage.pageHeading(driver).getText());
		ScreenShots.TakesScreenshot(driver, "Registration page");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		RegistrationPage.emailField(driver).sendKeys(DataFile.userEmail);
		Assert.assertEquals(DataFile.userEmail, RegistrationPage.emailField(driver).getAttribute("value"));
		
		RegistrationPage.firstNameField(driver).sendKeys(DataFile.userFirstName);
		Assert.assertEquals(DataFile.userFirstName, RegistrationPage.firstNameField(driver).getAttribute("value") );

		RegistrationPage.lastNameField(driver).sendKeys(DataFile.userLastName);
		Assert.assertEquals(DataFile.userLastName, RegistrationPage.lastNameField(driver).getAttribute("value"));
		//firstNameField.clear();
		
		Select currentlyEducationField = new Select(RegistrationPage.educationDropdownList(driver));
		currentlyEducationField.selectByVisibleText(DataFile.chooseResponse);
		//Screenshot.takeScreenshot(driver, "DepartmentShot");
		
		wait.until(ExpectedConditions.visibilityOfAllElements(RegistrationPage.nextStepButton(driver)));
		RegistrationPage.nextStepButton(driver).submit();
		Assert.assertTrue(RegistrationPage.errorSummary(driver).isDisplayed());
		Assert.assertTrue(RegistrationPage.passwordError(driver).isDisplayed());
		ScreenShots.TakesScreenshot(driver, "Submit Error");
		
		
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
