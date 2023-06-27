package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation {
	
	public static WebElement jobsAndWorkExperienceTab(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"row-nav-primary\"]/div[1]/ul/li[1]/a"));
	}
	
	public static WebElement postgraduateStudyTab(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"row-nav-primary\"]/div[1]/ul/li[2]/a"));
	}

	public static WebElement searchGraduateJobsButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"nav-sm-dropdown-1\"]/div/div/div/div/div[1]/ul/li[1]/a"));
	}
	
	public static WebElement searchpostgraduateCoursesButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"nav-sm-dropdown-2\"]/div/div/div/div/div[1]/ul/li[1]/a"));
	}
	

}
