package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement searchButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"firstNames\"]"));
	}
	
	public static WebElement careersAdviceLink(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"row-nav-primary\"]/div[1]/ul/li[3]/a"));
	}
	
	public static WebElement getingAJobLink(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"nav-sm-dropdown-3\"]/div/div/div/div/div[1]/ul/li[2]/a"));
	}
	
	public static WebElement jobsAndWorkExperienceTab(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"row-nav-primary\"]/div[1]/ul/li[1]/a"));
	}
	

}
