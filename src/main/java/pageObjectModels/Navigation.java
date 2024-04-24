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
	
	public static WebElement careersAdviceTab(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"row-nav-primary\"]/div[1]/ul/li[3]/a"));
	}
	
	public static WebElement applyingForUniversityTab(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"row-nav-primary\"]/div[1]/ul/li[4]/a"));
	}

	public static WebElement searchGraduateJobsButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"nav-sm-dropdown-1\"]/div/div/div/div/div[1]/ul/li[1]/a"));
	}
	
	public static WebElement searchpostgraduateCoursesButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"nav-sm-dropdown-2\"]/div/div/div/div/div[1]/ul/li[1]/a"));
	}
	
	public static WebElement gettingAJobButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"nav-sm-dropdown-3\"]/div/div/div/div/div[1]/ul/li[2]/a"));
	}
	
	public static WebElement choosingACourseButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"nav-sm-dropdown-4\"]/div/div/div/div/div[1]/ul/li[1]/a"));
	}
	
	public static WebElement careersCentre (WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[6]/a"));
	}
	
	public static WebElement upcomingWebinarsLink (WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[6]/div/div/a[1]"));
	}
	
	public static WebElement yourToolkitLink (WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[6]/div/div/a[5]"));
	}
	
	public static WebElement loginLink (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"row-nav-primary\"]/div[2]/ul/li[1]/a"));
	}

}
