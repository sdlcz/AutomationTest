package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import driverUtilities.DriverUtilities;
import usefullmethods.screenShots;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class TestClass {
	
	WebDriver driver;
	
@Before
public void preConditions() throws InterruptedException {
	DriverUtilities myDriverUtilities = new DriverUtilities();
	driver = myDriverUtilities.getDriver();
	driver.manage().window().maximize();
//	driver.get("https://bbc.co.uk");
	//driver.navigate().refresh();
	//driver.get("https://google.com");
	//((RemoteWebDriver)driver).getCapabilities().getBrowserName();
	//((RemoteWebDriver)driver).getCapabilities().getBrowserVersion();
	driver.get("https://www.prospects.ac.uk/register");
	//driver.get("https://www.fdmgroup.com/investors/highlights/");
	

	
	

}

@Test
public void test() throws IOException {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	WebElement logInButton = driver.findElement(By.className("hilite"));
	System.out.println("Present:" +"\t"+ logInButton.isDisplayed());
	
	WebElement checkBox = driver.findElement(By.className("pill-action"));
	js.executeScript("arguments[0].scrollIntoView();", checkBox);
	checkBox.click();
	System.out.println("Selected:" +"\t"+ checkBox.isSelected());
	
	/*
	//Interact with table rows ex 1 - mod 10
	//Print all rows
	WebElement table = driver.findElement(By.xpath("//*[@id=\"section_3\"]/div/div[1]"));
	List<WebElement> rowsInTable = table.findElements(By.tagName("tr"));
	int rowNumber = 0;
	for (WebElement row: rowsInTable)
	{
		rowNumber++;
		System.out.println(rowNumber+ ":\t" + row.getText());
	}
	//print one row
	WebElement rowTwo = rowsInTable.get(2);
	System.out.println(rowTwo.getText());
	
	//Interacting with Table cells example
	WebElement cell = driver.findElement(By.xpath("//*[@id=\"section_3\"]/div/div[1]/div/table/tbody/tr[2]/td[1]")); 
	System.out.println(cell.getText());
	 */
	/*	// Mod 8, 9 & 10
	WebElement firstNameField = driver.findElement(By.id("firstNames"));
	firstNameField.sendKeys("Per");
	firstNameField.sendKeys("test");
	firstNameField.clear();
	
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

	WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"row-nav-primary\"]/div[2]/ul/li[2]/a"));
	searchButton.click();
	
	WebElement nameField = driver.findElement(By.xpath("//*[@id=\"firstNames\"]"));
	System.out.println(nameField.getText());
	
	// Scrolling down the page till the element is found		
	WebElement nextStepButton = driver.findElement(By.xpath("//*[@id=\"do-register\"]/div[11]/div/div/div[4]/div/button"));
//	js.executeScript("arguments[0].scrollIntoView();", nextStepButton);
//	nextStepButton.sendKeys(Keys.RETURN);
	//https://www.browserstack.com/guide/selenium-scroll-tutorial
	//nextStepButton.click(); or for form .submit();
	firstNameField.submit();
	 */
}

@After
public void tearDown() {
	driver.quit();
}




}

