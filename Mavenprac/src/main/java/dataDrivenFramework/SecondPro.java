package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;

import javax.swing.text.DateFormatter;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SecondPro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//location
		
		/*  File file=new File("D:\\excelfile\\newsheet1.xlsx"); //read cell
		  FileInputStream readcell=new FileInputStream(file); //sheet type xlsx or xls
		  XSSFWorkbook wb=new XSSFWorkbook(readcell); //get sheet 
		  XSSFSheet  sheet=wb.getSheet("Sheet1");
		  
		  for (int i = 0; i <=5; i++) { //get first row values 
			  XSSFRow row =  sheet.getRow(i); 
		  for (int j = 0; j < 2; j++) { 
		  XSSFCell cell =  row.getCell(j); String value = cell.getStringCellValue();
		  System.out.println(value); 
	  } 
	    } 
		  
		  int totalrows=sheet.getPhysicalNumberOfRows();   //total no of rows from sheet or use getlastRowNum()-it will not take first
		                                       
		   int totalcolumn=sheet.getRow(0).getPhysicalNumberOfCells();  //total no ofcolumn or use getlastCellNum()-it will not take first cell
		 
		  System.out.println(totalrows); System.out.println(totalcolumn);*/
		 
		
		
		File f2=new File("D:\\excelfile\\newsheet1.xlsx");
		FileInputStream in=new FileInputStream(f2);
		XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet2=book.getSheet("Sheet1");
		
		for (int i = 0; i <5; i++) {
			XSSFRow rows = sheet2.getRow(i);
			for (int j = 0; j < 2; j++) {
				XSSFCell column = rows.getCell(j);
				String val = column.getStringCellValue();
				System.out.println(val);
			} 
		}
		int rowcount=sheet2.getLastRowNum();
		short colcount=sheet2.getRow(0).getLastCellNum();
		System.out.println("Total rows are :"+rowcount);
		System.out.println("Total columns are :"+colcount);
		
		
		
		
		
		
	}

}
