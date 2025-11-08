package pagefactoryInPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutUsingFindby {

	//it will accept only id or name locator
	public static WebElement email;
	public static WebElement pass;
	public static WebElement loginbutton;
	
	@Test
	public void loginFB() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		PageFactory.initElements(driver,WithoutUsingFindby.class );
		WithoutUsingFindby.email.sendKeys("alan");
		WithoutUsingFindby.pass.sendKeys("adam");
		WithoutUsingFindby.loginbutton.click();
		
		
		
	}
	
	
	
	
	
}
