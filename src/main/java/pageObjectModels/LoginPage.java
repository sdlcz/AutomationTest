package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebElement emailField(WebDriver driver) {
		return driver.findElement(By.id("username"));
	}
	
	public static WebElement passwordField(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement keepMeLoggedCheckBox(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"_spring_security_remember_me\"]"));
	}
	
	public static WebElement logInButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/form/button"));
	}

	public static WebEle

}
