package testPackage;

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

public class testCaseEx {
WebDriver driver;
	
@Before
public void preConditions() {
	DriverUtilities myDriverUtilities = new DriverUtilities();
	driver = myDriverUtilities.getDriver();
	driver.manage().window().maximize();
	driver.get("https://bbc.co.uk");
	driver.get("https://www.prospects.ac.uk/register");
	
}

@Test
public  void functionalityToTest() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Assert.assertEquals("https://www.prospects.ac.uk/register", driver.getCurrentUrl());

	List<WebElement> results = driver.findElements(By.name("currentlyInEducation"));
	for (WebElement result:results)
	{
		System.out.println("Element: " + result.getText());
	}
	
	List<WebElement> resultsh = driver.findElements(By.tagName("h1"));
	for (WebElement resulth:resultsh)
	{
		System.out.println("Title: " + resulth.getText());
	}
}

@After
public void tearDown() {
	driver.quit();
}

}
