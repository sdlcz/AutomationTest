package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {

	public static WebElement contactUsButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div/ul/li[1]/a"));
	}
	
	public static WebElement instagramButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div/ul/li[2]/a"));
	}
	
	public static WebElement facebookButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div/ul/li[3]/a"));
	}
	
	public static WebElement twitterButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div/ul/li[4]/a"));
	}

	public static WebElement linkedinButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div/ul/li[5]/a"));
	}
	
	public static WebElement youtubeButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div/ul/li[6]/a"));
	}
	
	public static WebElement podcastsButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div/ul/li[7]/a"));
	}
	

}

