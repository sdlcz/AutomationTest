package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverUtilities.DriverUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginNegativeTest {
	
	WebDriver driver; 
	
	@Given("user is on swag login page")
	public void user_is_on_swag_login_page() {
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get("https://www.saucedemo.com/");
		
	}

	@When("user skips username and login page")
	public void user_skips_username_and_login_page() {
		
	}

	@And("clicks on login")
	public void clicks_on_login() {
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

	@Then("error message is displayed")
	public void error_message_is_displayed() {
		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()"));
	}

	@And("user enters username without a password")
	public void user_enters_username_without_a_password() {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	}

	@Then("the same error message is displayed")
	public void the_same_error_message_is_displayed() {
		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()"));
	}

	@And("user enters a password without username")
	public void user_enters_a_password_without_username() {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");

	}
	
	@Then("same error message is displayed")
	public void same_error_message_is_displayed() {
		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()"));
	}


}
