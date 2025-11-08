package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstPro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	    //1.mention the path of  the excel file or excel workbook
		File f=new File("D:\\excelfile\\Test1.xlsx");
		
		//2.create object for file inputstream class to read each cell
		FileInputStream in=new FileInputStream(f);
		
		//3.to mention the type of excel worksheet -xlsx or .xls
		XSSFWorkbook wb=new XSSFWorkbook(in);
		
		//4.to get the sheet_>getsheet()--->abstract class workbook --->interface
		Sheet sheet=wb.getSheet("Sheet1");
		
		
		//5. to get the row -->getRow()
		Row r=sheet.getRow(0);
		
		//6. to get the cell(cell means column)
		Cell c=r.getCell(0);
		
		//7 print the cell value
		System.out.println(c);
		
		//8 to know the number of row present
		int totalRows=sheet.getPhysicalNumberOfRows();
		System.out.println("No of row :"+totalRows);
		
		
//HW below	      
		//9 to know the number of cells present
		int NoOfColumn=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("no of cell "+NoOfColumn);
		
		//10 print a single row data
		Row row=sheet.getRow(0);
		System.out.println("single row data ");
		for (int i = 0; i < 2; i++) {
			Cell cells = row.getCell(i);
			String cellvalues = cells.getStringCellValue();
			System.out.print(cellvalues);
		}
		
		
		//11 print all row data
         System.out.println("____________________________________");
         
		System.out.println("print all row data");
		int totalrows=sheet.getPhysicalNumberOfRows(); 
		int totalcolumn=sheet.getRow(0).getPhysicalNumberOfCells(); 
		short  allcell=sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < totalrows; i++) {
			Row row1 = sheet.getRow(i);
			for (int j = 0; j < allcell; j++) {
				Cell cell1 = row1.getCell(j);
				DataFormatter d=new DataFormatter();//- it will convert the numeric to stringvalue
				String convertvalue=d.formatCellValue(cell1);
				//String totalvalue = cell1.getStringCellValue();- only print string value
				System.out.println(convertvalue);
			} 
		}
		
		
		//12 get stringcellvalue
		for (int i = 0; i < totalrows; i++) {
			Row row4 = sheet.getRow(i);
			for (int j = 0; j < totalcolumn; j++) {
				Cell cells = row4.getCell(j);
				String s2 = cells.getStringCellValue();
				System.out.println(s2);
			} 
		}
		
		
		
		//13 get numericvalue
		
		Row row5=sheet.getRow(5);
		Cell cell1=row5.getCell(1);
		double numvalue=cell1.getNumericCellValue();
		System.out.println("Numeric value is "+numvalue);
		
		
	
		
		
		
		
		
		
		
	}

}
