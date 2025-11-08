package pageobjectRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjectTestCases.LoginTestcase;


public class LoginOperation {
	
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	
	LoginTestcase.firstname(driver).sendKeys("Alan");
	LoginTestcase.lastname(driver).sendKeys("adam");
	LoginTestcase.email(driver).sendKeys("test@gmail.com");
	
	}
	
	
	
	
	
	
	
}
