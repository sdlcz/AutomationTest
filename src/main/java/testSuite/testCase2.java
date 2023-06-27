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
import pageObjectModels.Footer;
import pageObjectModels.HomePage;
import pageObjectModels.Navigation;
import usefullMethods.ScreenShots;

public class testCase2 {
	WebDriver driver;
	
	@Before
	public void preConditions() {
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.prospects.ac.uk/");
		
	}

	@Test
	public  void testSocialMediaButtons() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Navigation.jobsAndWorkExperienceTab(driver).click();
		
		//Code repeated - Abstract it
		Navigation.searchGraduateJobsButton(driver).click();
		Assert.assertTrue(Footer.contactUsButton(driver).isDisplayed());
		Assert.assertTrue(Footer.instagramButton(driver).isDisplayed());
		Assert.assertTrue(Footer.facebookButton(driver).isDisplayed());
		Assert.assertTrue(Footer.twitterButton(driver).isDisplayed());
		Assert.assertTrue(Footer.linkedinButton(driver).isDisplayed());
		Assert.assertTrue(Footer.youtubeButton(driver).isDisplayed());
		Assert.assertTrue(Footer.podcastsButton(driver).isDisplayed());
		
		js.executeScript("arguments[0].scrollIntoView();", Footer.contactUsButton(driver));
		ScreenShots.TakesScreenshot(driver, "Search graduate Jobs - Social Media Buttons");
		
		Navigation.postgraduateStudyTab(driver).click();
		Navigation.searchpostgraduateCoursesButton(driver).click();
		Assert.assertTrue(Footer.contactUsButton(driver).isDisplayed());
		Assert.assertTrue(Footer.instagramButton(driver).isDisplayed());
		Assert.assertTrue(Footer.facebookButton(driver).isDisplayed());
		Assert.assertTrue(Footer.twitterButton(driver).isDisplayed());
		Assert.assertTrue(Footer.linkedinButton(driver).isDisplayed());
		Assert.assertTrue(Footer.youtubeButton(driver).isDisplayed());
		Assert.assertTrue(Footer.podcastsButton(driver).isDisplayed());
		
		js.executeScript("arguments[0].scrollIntoView();", Footer.contactUsButton(driver));
		ScreenShots.TakesScreenshot(driver, "Search postgraduate courses - Social Media Buttons");
		
	}

	@After
	public void tearDown() {
		//driver.quit();
	}
}
