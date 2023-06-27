package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	public static WebElement pageHeading(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div/header/h1"));
	}
	
	public static WebElement emailField(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement firstNameField(WebDriver driver) {
		return driver.findElement(By.id("firstNames"));
	}
	
	public static WebElement lastNameField(WebDriver driver) {
		return driver.findElement(By.id("lastName"));
	}
	
	public static WebElement educationDropdownList(WebDriver driver) {
		return driver.findElement(By.name("currentlyInEducation"));
	}

	public static WebElement nextStepButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"do-register\"]/div[11]/div/div/div[4]/div/button"));
	}
	
	public static WebElement errorSummary(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div"));
	}
	
	public static WebElement passwordError(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"password-err-1\"]"));
	}
}
