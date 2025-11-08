package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HWdataDriven {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		/*File file=new File("C:\\Users\\Ashwin Thomas\\eclipse-workspace\\Mavenprac\\ExcelSheet\\updatedsheet.xlsx");
		FileInputStream in=new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet=book.getSheet("Sheet1");
		//1 get how many row and column
		System.out.println("Total rows are :"+sheet.getPhysicalNumberOfRows());
		System.out.println("Total columns are :"+sheet.getRow(0).getPhysicalNumberOfCells());
		
		for (int i = 0; i < 5; i++) {
			//2 print all data
			XSSFRow totalRows = sheet.getRow(i);
			for (int j = 0; j < 2; j++) {
				XSSFCell totalcell = totalRows.getCell(j);
				String totalvalue = totalcell.getStringCellValue();
				System.out.println(totalvalue);
			} 
		}*/
		
		//3 create row
		/*File file=new File("C:\\Users\\Ashwin Thomas\\eclipse-workspace\\Mavenprac\\ExcelSheet\\alansheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet csheet=workbook.createSheet();
		XSSFRow  cRow=csheet.createRow(5);
		XSSFCell cColumn=cRow.createCell(0);
		cColumn.setCellValue("Alan");
		FileOutputStream f=new FileOutputStream(file);
		workbook.write(f);
		System.out.println("excel sheet completed");*/
		
		//5 create sheet for hotel booking
		File file=new File("C:\\Users\\Ashwin Thomas\\eclipse-workspace\\Mavenprac\\ExcelSheet\\alan1sheet.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet1=book.createSheet();
		//column1
		XSSFRow crow=sheet1.createRow(0);
		XSSFCell cColumn=crow.createCell(0);
		cColumn.setCellValue("Properties");
		crow.createCell(1).setCellValue("Credentials");
		
		XSSFRow crow1=sheet1.createRow(1);
		XSSFCell cColumn1=crow1.createCell(0);
		cColumn1.setCellValue("Username");
		crow1.createCell(1).setCellValue("alan@gmail.com");
				
		XSSFRow crow2=sheet1.createRow(2);
		XSSFCell cColumn2=crow2.createCell(0);
		cColumn2.setCellValue("Password");		
		crow2.createCell(1).setCellValue("*********");
		
		
		FileOutputStream out=new FileOutputStream(file);
		book.write(out);
		System.out.println("excel sheet completed");
				
				
				
				
				
				
				
				
				
				
		
		
		
		
	}

}
