package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() {
	long starttime=System.currentTimeMillis();
	
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Selenium ChromeDriver\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		 driver=new ChromeDriver();	
	}
	
	
	@Test
	public void google() {
		driver.get("https://www.google.com/");
		
	}
	
	
	@Test
	public void bing() {
		driver.get("https://www.bing.com/");
		long endtime=System.currentTimeMillis();
		
	}
	
	
	
	
	
	
}
