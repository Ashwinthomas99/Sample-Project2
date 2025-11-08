package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateSheetAndLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		//6 and 7 hw 
		
		File file=new File("C:\\Users\\Ashwin Thomas\\eclipse-workspace\\Mavenprac\\ExcelSheet\\alan2sheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		XSSFRow cRow=sheet.createRow(0);
		cRow.createCell(0).setCellValue("username");
		cRow.createCell(1).setCellValue("Password");
		
		XSSFRow c1Row=sheet.createRow(1);
		c1Row.createCell(0).setCellValue("alan@gmail.com");
		c1Row.createCell(1).setCellValue("alan");
		
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
		System.out.println("Excel sheet created");
		
		Thread.sleep(2000);
		//get value
		File file1=new File("C:\\Users\\Ashwin Thomas\\eclipse-workspace\\Mavenprac\\ExcelSheet\\alan2sheet.xlsx");
		FileInputStream in=new FileInputStream(file1);
		XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet1=book.getSheet("Sheet0");
		XSSFRow row1=sheet1.getRow(1);
		XSSFCell col1=row1.getCell(0);
		String val=col1.getStringCellValue();
		System.out.println("Username is :"+val);
		
		XSSFCell cell2=row1.getCell(1);
		String val1=cell2.getStringCellValue();
		System.out.println("Password is :"+val1);

		Thread.sleep(2000);
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		
		  WebElement user=driver.findElement(By.xpath("//*[@id='email']"));
		  user.sendKeys(val);
		  WebElement pass= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]"));
		  pass.sendKeys(val1);
		//doubt
	}

}
