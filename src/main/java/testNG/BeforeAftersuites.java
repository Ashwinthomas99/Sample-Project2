package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAftersuites {
	WebDriver driver;
	
	@BeforeSuite
	public void BrowserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	}
		 @Test(priority = 1)
		 public void google() {
			 long starTtime=System.currentTimeMillis();
		 driver.get("https://www.google.com/");
		 System.out.println(starTtime);
		 }
		 
		 
		 @Test(priority = 2)
		 public void youtube() {
			driver.get("https://www.youtube.com/"); 
		 }
		 
		 
		 @Test(priority = 3)
		 public void bing() {
		 
		 driver.get("https://www.bing.com/");
		 
		 
		 }
		 
		 
		 @AfterSuite
		 public void closebrowser() {
			 
			 driver.quit();
			 System.out.println("Program run successfully");
			 
			 long endtime=System.currentTimeMillis();
			 //long totaltime=endtime-starttime;
			 
			 System.out.println(endtime);
			 
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
}
