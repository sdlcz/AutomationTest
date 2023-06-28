package testSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import driverUtilities.DriverUtilities;
import junit.framework.Assert;
import pageObjectModels.Navigation;
import testData.DataFile;

public class testCase3 {

	WebDriver driver;
	
@Before
public void preConditions() {
	DriverUtilities myDriverUtilities = new DriverUtilities();
	driver = myDriverUtilities.getDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gradcracker.com/");
	
}

@Test
public void testInterviewTips() {
	Actions hoverCareers = new Actions(driver);
	hoverCareers.moveToElement(Navigation.careersCentre(driver)).perform();
	Navigation.upcomingWebinarsLink(driver).isDisplayed();
	
	Navigation.upcomingWebinarsLink(driver).click();
	Assert.assertEquals(DataFile.upcomingWebinarsPageURL, driver.getCurrentUrl());
	
	hoverCareers.moveToElement(Navigation.careersCentre(driver)).perform();
	Navigation.yourToolkitLink(driver).click();
	Assert.assertEquals(DataFile.toolkitEbook, driver.getCurrentUrl());
	
	driver.navigate().back();
	Assert.assertEquals(DataFile.upcomingWebinarsPageURL, driver.getCurrentUrl());
	
}

@After
public void teardown() {
	driver.quit();
}

}
