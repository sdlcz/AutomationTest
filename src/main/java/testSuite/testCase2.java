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

	    // Test social media buttons on different pages
	    testSocialMediaButtonsOnPage("Jobs and Work Experience", Navigation.jobsAndWorkExperienceTab(driver), js);
	    testSocialMediaButtonsOnPage("Search Graduate Jobs", Navigation.searchGraduateJobsButton(driver), js);
	    testSocialMediaButtonsOnPage("Postgraduate Study", Navigation.postgraduateStudyTab(driver), js);
	    testSocialMediaButtonsOnPage("Search Postgraduate Courses", Navigation.searchpostgraduateCoursesButton(driver), js);
	    testSocialMediaButtonsOnPage("Careers Advice", Navigation.careersAdviceTab(driver), js);
	    testSocialMediaButtonsOnPage("Getting a Job", Navigation.gettingAJobButton(driver), js);
	    testSocialMediaButtonsOnPage("Applying for University", Navigation.applyingForUniversityTab(driver), js);
	    testSocialMediaButtonsOnPage("Choosing a Course", Navigation.choosingACourseButton(driver), js);
	}

	private void testSocialMediaButtonsOnPage(String pageName, WebElement pageElement, JavascriptExecutor js) throws Exception {
	    pageElement.click();
	    
	    // Perform common assertions for social media buttons
	    assertSocialMediaButtonDisplayed(pageName, Footer.contactUsButton(driver));
	    assertSocialMediaButtonDisplayed(pageName, Footer.instagramButton(driver));
	    assertSocialMediaButtonDisplayed(pageName, Footer.facebookButton(driver));
	    assertSocialMediaButtonDisplayed(pageName, Footer.twitterButton(driver));
	    assertSocialMediaButtonDisplayed(pageName, Footer.linkedinButton(driver));
	    assertSocialMediaButtonDisplayed(pageName, Footer.youtubeButton(driver));
	    assertSocialMediaButtonDisplayed(pageName, Footer.podcastsButton(driver));
	    
	    // Scroll to contact us button and take a screenshot
	    js.executeScript("arguments[0].scrollIntoView();", Footer.contactUsButton(driver));
	    ScreenShots.TakesScreenshot(driver, pageName + " - Social Media Buttons");
	}

	private void assertSocialMediaButtonDisplayed(String pageName, WebElement buttonElement) {
	    Assert.assertTrue(pageName + " - " + buttonElement.getAttribute("id") + " is not displayed.", buttonElement.isDisplayed());
	}
	
@After
public void tearDown() {
	driver.quit();
	}
}
/*
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

Navigation.careersAdviceTab(driver).click();
Navigation.gettingAJobButton(driver).click();
Assert.assertTrue(Footer.contactUsButton(driver).isDisplayed());
Assert.assertTrue(Footer.instagramButton(driver).isDisplayed());
Assert.assertTrue(Footer.facebookButton(driver).isDisplayed());
Assert.assertTrue(Footer.twitterButton(driver).isDisplayed());
Assert.assertTrue(Footer.linkedinButton(driver).isDisplayed());
Assert.assertTrue(Footer.youtubeButton(driver).isDisplayed());
Assert.assertTrue(Footer.podcastsButton(driver).isDisplayed());
js.executeScript("arguments[0].scrollIntoView();", Footer.contactUsButton(driver));
ScreenShots.TakesScreenshot(driver, "Getting a job - Social Media Buttons");

Navigation.applyingForUniversityTab(driver).click();
Navigation.choosingACourseButton(driver).click();
Assert.assertTrue(Footer.contactUsButton(driver).isDisplayed());
Assert.assertTrue(Footer.instagramButton(driver).isDisplayed());
Assert.assertTrue(Footer.facebookButton(driver).isDisplayed());
Assert.assertTrue(Footer.twitterButton(driver).isDisplayed());
Assert.assertTrue(Footer.linkedinButton(driver).isDisplayed());
Assert.assertTrue(Footer.youtubeButton(driver).isDisplayed());
Assert.assertTrue(Footer.podcastsButton(driver).isDisplayed());
js.executeScript("arguments[0].scrollIntoView();", Footer.contactUsButton(driver));
ScreenShots.TakesScreenshot(driver, "Choosing a course - Social Media Buttons");
*/