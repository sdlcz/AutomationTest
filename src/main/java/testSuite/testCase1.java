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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testData.DataFile;
import usefullMethods.ScreenShots;
import pageObjectModels.HomePage;
import pageObjectModels.RegistrationPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testCase1 {
WebDriver driver;
JavascriptExecutor js = (JavascriptExecutor) driver;

//@Before
@Given("edge browser is open")
public void edge_browser_is_open() {
	DriverUtilities myDriverUtilities = new DriverUtilities();
	driver = myDriverUtilities.getDriver();

}

//@Test
@And("user is on the registration page")
public void user_is_on_the_registration_page() {
	System.out.println("Regpage");
	driver.get(DataFile.registrationPageURL);
	Assert.assertEquals(DataFile.registrationPageURL, driver.getCurrentUrl());
	Assert.assertEquals(DataFile.registrationPageHeading, RegistrationPage.pageHeading(driver).getText());
//	ScreenShots.TakesScreenshot(driver, "Registration page");
	

}

@When("user enters the email, first name, last name and education field")
public void user_enters_the_email_first_name_last_name_and_education_field() {
	System.out.println("enter data");
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
	
}

@And("clicks on submit button")
public void clicks_on_submit_button() {
	System.out.println("click submit");
	RegistrationPage.nextStepButton(driver).submit();
}

@Then("an error message is displayed")
public void an_error_message_is_displayed() {
	System.out.println("error displayed");
	Assert.assertTrue(RegistrationPage.errorSummary(driver).isDisplayed());
	Assert.assertTrue(RegistrationPage.passwordError(driver).isDisplayed());
//	ScreenShots.TakesScreenshot(driver, "Submit Error");
}

@After
public void tearDown() {
	driver.quit();
}

//	
//	@Before
//	public void preConditions() {
//		DriverUtilities myDriverUtilities = new DriverUtilities();
//		driver = myDriverUtilities.getDriver();
//		driver.manage().window().maximize();
//		driver.get(DataFile.homePageURL);
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//	


//	@Test
//	
//	public  void functionalityToTest() throws Exception {
//		//HomePage.searchButton(driver).click();
//		//HomePage.careersAdviceLink(driver).click();
//		//HomePage.getingAJobLink(driver).click();
////		WebDriverWait wait = new WebDriverWait(driver,30);
//		//wait.equals(driver.getCurrentUrl());
//		//Assert.assertEquals(DataFile.gettingAJobPageURL, driver.getCurrentUrl());
//		
//		driver.get(DataFile.registrationPageURL);
//		Assert.assertEquals(DataFile.registrationPageURL, driver.getCurrentUrl());
//		Assert.assertEquals(DataFile.registrationPageHeading, RegistrationPage.pageHeading(driver).getText());
//		ScreenShots.TakesScreenshot(driver, "Registration page");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		RegistrationPage.emailField(driver).sendKeys(DataFile.userEmail);
//		Assert.assertEquals(DataFile.userEmail, RegistrationPage.emailField(driver).getAttribute("value"));
//		
//		RegistrationPage.firstNameField(driver).sendKeys(DataFile.userFirstName);
//		Assert.assertEquals(DataFile.userFirstName, RegistrationPage.firstNameField(driver).getAttribute("value") );
//
//		RegistrationPage.lastNameField(driver).sendKeys(DataFile.userLastName);
//		Assert.assertEquals(DataFile.userLastName, RegistrationPage.lastNameField(driver).getAttribute("value"));
//		//firstNameField.clear();
//		
//		Select currentlyEducationField = new Select(RegistrationPage.educationDropdownList(driver));
//		currentlyEducationField.selectByVisibleText(DataFile.chooseResponse);
		//Screenshot.takeScreenshot(driver, "DepartmentShot");
		
//		wait.until(ExpectedConditions.visibilityOfAllElements(RegistrationPage.nextStepButton(driver)));
//		RegistrationPage.nextStepButton(driver).submit();
//		Assert.assertTrue(RegistrationPage.errorSummary(driver).isDisplayed());
//		Assert.assertTrue(RegistrationPage.passwordError(driver).isDisplayed());
//		ScreenShots.TakesScreenshot(driver, "Submit Error");
//		
//		
//	}

//	@After
//	public void tearDown() {
//		driver.quit();
//	}
}
