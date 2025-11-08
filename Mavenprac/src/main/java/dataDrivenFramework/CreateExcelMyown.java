package dataDrivenFramework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelMyown {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		//mention excel type
		XSSFWorkbook workbook=new XSSFWorkbook();
		//create sheet
		XSSFSheet sheet=workbook.createSheet("My excel");
		//create row
		XSSFRow createdRow=sheet.createRow(0);
		//create column
		XSSFCell createdcol=createdRow.createCell(0);
		//setvalue
		createdcol.setCellValue("Hello");
		
		File file=new File("‪C:\\Users\\Ashwin Thomas\\eclipse-workspace\\Mavenprac\\ExcelSheet\\Book123.xlsx");
		FileOutputStream f=new FileOutputStream(file);
		workbook.write(f);
		
		/*XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Myfirstsheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("hello");
		sheet.getRow(0).createCell(1).setCellValue("world");

		/*File file=new File("‪C:\\Users\\Ashwin Thomas\\eclipse-workspace\\Mavenprac\\ExcelSheet\\myexcel.xlsx");
		file.getParentFile().mkdirs();

		FileOutputStream f=new FileOutputStream(file);
		workbook.write(f);
		f.close();  */       // Always close the stream
        workbook.close(); 
        System.out.println("Excel file created successfully!");

		
		
		
	}

}
