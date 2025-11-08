package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateSheetforHotelrbooking {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		File file=new File("C:\\Users\\Ashwin Thomas\\eclipse-workspace\\Mavenprac\\ExcelSheet\\alan3.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("Sheet1");
		
		XSSFRow cRow1=sheet.createRow(0);
		cRow1.createCell(0).setCellValue("UserName");
		cRow1.createCell(1).setCellValue("Password");
		
		XSSFRow cRow2=sheet.createRow(1);
		cRow2.createCell(0).setCellValue("alan@gmail.com");
		cRow2.createCell(1).setCellValue("Alan");
		
		FileOutputStream out=new FileOutputStream(file);
		book.write(out);
		System.out.println("Excel sheet created");
		
		FileInputStream in=new FileInputStream(file);
		XSSFWorkbook book1=new XSSFWorkbook(in);
		XSSFSheet gRow=book1.getSheet("Sheet1");
		XSSFRow row1=gRow.getRow(1);
		String val=row1.getCell(0).getStringCellValue();
		String val2=row1.getCell(1).getStringCellValue();
		System.out.println("username is :"+val);
		System.out.println("Password is :"+val2);
		
		Thread.sleep(2000);
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.adactin.com/HotelApp/index.php");
		
		  WebElement user=driver.findElement(By.id("username"));
		  user.sendKeys(val);
		  WebElement pass=driver.findElement(By.id("password"));
		  user.sendKeys(val2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
