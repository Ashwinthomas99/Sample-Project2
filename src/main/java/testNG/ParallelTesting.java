package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	@Test
	public void myntra() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/");
	}
	
	@Test
   public void facebook() {
	   System.setProperty("webdriver.chrome.driver","D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
	}

	
   
   
   
}
