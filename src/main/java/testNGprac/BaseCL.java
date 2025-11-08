package testNGprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseCL {
 
	static WebDriver  driver;
	@Test
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	//driver.navigate().to("https://www.facebook.com/");
	giveinput();
	
}
	
	
	
	
	
	
	
	
	
	
	public static void giveinput() {
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		WebElement  e=driver.findElement(By.id("email"));
		e.sendKeys("Alan");
	}
	

	
	
	
	
	
	
}
