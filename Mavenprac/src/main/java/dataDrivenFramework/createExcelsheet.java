package dataDrivenFramework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createExcelsheet {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		//create excel sheet
		//1.to mention the path of excel file
		 File f=new File("‪D:\\excelfile\\myexcel1.xlsx");
		 

		//2. to mention the type of excel workbook
		XSSFWorkbook wb=new XSSFWorkbook();
	    //3	create excel sheet
		XSSFSheet sheet=wb.createSheet("Mysheet");
		//4 create row
		XSSFRow row=sheet.createRow(0);
		//5.create column
		XSSFCell cell= row.createCell(0);
		//6. set data
		cell.setCellValue("framework");
		//7  create object for fileoutputstream
		//File f=new File("‪C:\\Users\\Ashwin Thomas\\eclipse-workspace\\Mavenprac\\ExcelSheet\\myexcel1.xlsx");
         FileOutputStream out=new FileOutputStream(f);
		//8 write in the workbook
		wb.write(out);
		out.close();
		wb.close();
		System.out.println("excel write completed");
	
		
		
		
		
		
		
	}

}
