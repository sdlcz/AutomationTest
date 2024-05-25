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

public class testCase5 {
	WebDriver driver;
	
	@Before
	public void preConditions() {	
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@Test
	public void testLoginPage() {
		Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
		//Positive test
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		Assert.assertEquals("standard_user", driver.findElement(By.xpath("//*[@id=\"user-name\"]")).getAttribute("value"));
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		Assert.assertEquals("secret_sauce",driver.findElement(By.xpath("//*[@id=\"password\"]")).getAttribute("value"));
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
		driver.navigate().back();
		
		//Negative test
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("test_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).isDisplayed());
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	

}
