package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAndAfterSuites {
	WebDriver driver;
	
	@BeforeSuite
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
	
	@Test(priority = 0)
	public void google() {
		driver.get("http://www.google.com");
		
	}
	
	@Test(priority = 1)
	public void flipkart() {
		driver.get("https://www.flipkart.com/");
		
	}
	
	@Test(priority = 2)
	public void amazon() {
		driver.get("http://www.amazon.in");
		
	}
	
	@AfterSuite
	public void close() {
		driver.quit();
		
	}
	
	
	
	
	
}
