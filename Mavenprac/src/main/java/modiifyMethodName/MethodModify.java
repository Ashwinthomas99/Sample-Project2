package modiifyMethodName;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class MethodModify {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
	//fblogin	 
		 url();
		thalaippu();//tittle
		WantURL();//url
		username();//sendkeys
		login();//button
		waitpannu();//thread.sleep
		backword();//backword
		reload();//refresh
		fullscreen();//maximize
	//alert program
		waitpannu();//thread.sleep
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		bClick();//click
		alertpopup(); //accept
	//Drag and drop
		//waitpannu();//thread.sleep
		//driver.navigate().to("https://www.w3schools.com/html/html5_draganddrop.asp");
		//EleDragDrop();
		partialScreenshots();
		fullScreenshot();
		totalLink();
		totalImg();
		totalRow();
		totalcolumn();
		attribute();
		uploadFile();
		downloadfile();
		//half();//minimize
    	//closed();//close 
		
		
		
	}
	
	public static void url() {
		driver.navigate().to(("https://www.facebook.com/"));
	}

	public static void thalaippu() {
		System.out.println(driver.getTitle());
	}
	
	public static void WantURL() {
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void username() {
		WebElement user=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		user.sendKeys("alan@gmail.com");
		
	}
	
	public static void password() {
		WebElement user=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		user.sendKeys("alan");
	}
	
	public static void login() {
		WebElement user=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
	    user.click();
	    
	}
	
	public static void backword() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().back();
	    
	}
	
	public static void reload()  {
		
		driver.navigate().refresh();    
	}
	
    public static void fullscreen()  {
		
		driver.manage().window().maximize(); 
	}
	
    public static void half()  {
		
		driver.manage().window().minimize();   
	}
	
   public static void closed()  {
		
		driver.close();  
	}
	
	
   public static void  bClick() {
		
	   WebElement button=driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
	   button.click(); 
	}
	
   public static void  alertpopup() {
		
	   Alert a=driver.switchTo().alert();
	   a.accept();
	}
	
   public static void  EleDragDrop() {
	   WebElement ele1=driver.findElement(By.id("div1"));
	   WebElement ele2=driver.findElement(By.id("div2"));
	   Actions act=new Actions(driver);
	   act.dragAndDrop(ele1, ele2).perform();
	   
	}
	
   public static void waitpannu() throws InterruptedException {
	   Thread.sleep(2000);
   }
	
   public static void  partialScreenshots() throws IOException{
	   TakesScreenshot scr=(TakesScreenshot) driver;
	   File img =scr.getScreenshotAs(OutputType.FILE);
	   File file=new File("D://NewPartialscreen.png");
	   FileHandler.copy(img, file); 
   }
   
   
   public static void fullScreenshot() throws AWTException, IOException {
	 Robot robo=new Robot();   
	 Dimension screensize= Toolkit.getDefaultToolkit().getScreenSize();  
	   Rectangle rec=new Rectangle(screensize);
	   BufferedImage fulscr=  robo.createScreenCapture(rec);
	   File f=new File("D://NewFullscreen.png");
	   ImageIO.write(fulscr, "png", f);
	   
   }
   
   
   public static void totalLink() {
	   driver.get("https://thanvitechnologies.com/hire_php.php");
	   List<WebElement> allLink= driver.findElements(By.tagName("a"));
	   System.out.println("Total links are :"+allLink.size());
   }
   
   
   public static void totalImg() {
	   driver.get("https://thanvitechnologies.com/hire_php.php");
	   List<WebElement>allImg= driver.findElements(By.tagName("img"));
	   System.out.println("Total images are :"+allImg.size());
   }
   
   public static void totalRow() {
	   driver.get("file:/C:/Users/Ashwin%20Thomas/OneDrive/Desktop/Ashwin/table.html");
	   List<WebElement> rowCount= driver.findElements(By.tagName("tr"));
	   System.out.println("Total rows are :"+rowCount.size());
	   
   }
   
   
   public static void totalcolumn() {
	   driver.get("file:/C:/Users/Ashwin%20Thomas/OneDrive/Desktop/Ashwin/table.html");
	   List<WebElement> rowCol= driver.findElements(By.tagName("th"));
	   System.out.println("Total col are :"+rowCol.size());
	   
   }
   
   public static void attribute() {
	   driver.get("https://thanvitechnologies.com/career.php");
	   WebElement getatt=driver.findElement(By.xpath("//button[@name=\"submit\"]"));
	   System.out.println(getatt.getAttribute("name"));
   }
   
   
   public static void uploadFile() throws AWTException, InterruptedException {
	   driver.get("file://C://Users//Ashwin%20Thomas//OneDrive//Desktop//Ashwin//upload.html");
	   WebElement button=  driver.findElement(By.id("chooseFileBtn"));
	   button.click();
	   
	   StringSelection select=new StringSelection("C:\\Users\\Ashwin Thomas\\Downloads\\https___pdfmyurl_com_faq.pdf");
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
	   Thread.sleep(3000);
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
	   System.out.println("successfully");
	   
   }
   
   public static void downloadfile() throws InterruptedException {
	   driver.get("https://pdfmyurl.com/save-as-pdf");
	   
		WebElement link=driver.findElement(By.linkText("Download the FAQ as PDF!"));
		link.click();
		Thread.sleep(3000);
		
		File filelocation=new File("‪C:\\Users\\Ashwin Thomas\\Downloads");
		File[] downloadfiles=filelocation.listFiles();
		
		System.out.println(downloadfiles.length);
	   
		for (File file : downloadfiles) {
		
			if (file.getName().equals("https___pdfmyurl_com_faq.pdf")) {
				System.out.println("pass");
				break;
				
			} else {
				System.out.println("loss");
			}
			
			
			
			
			
			
		}
	   
   }
   
   
   
   
   
   
   
   
   
   
   
   
	
}
