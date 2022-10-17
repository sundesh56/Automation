package com.agileCrmAutomation;





import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil1 {
	
	static Workbook wb;

	public static void main(String[] args) throws IOException{
		
		
		String filePath = "D:\\AutomationTestData.xlsx";
		String extension = filePath.substring(filePath.indexOf("."));
		System.out.println(extension);
			
		FileInputStream input = new FileInputStream(filePath);
		
		 	if(extension.equals(".xlsx")) {
			wb = new XSSFWorkbook(input);
		}else {
			wb = new HSSFWorkbook(input);
		}
		  Sheet sheet = wb.getSheet("LoginTestdata");
		  
	       int totalRows = sheet.getPhysicalNumberOfRows();
		   int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();		  
		   for(int i=1; i<totalRows; i++) {
			Row row = sheet.getRow(i);
	        for(int j=0;j<totalColumns; j++) 
	        {
                Cell cell=row.getCell(j);
	        	String value = cell.getStringCellValue();
	        	System.out.println(value);	
	        }
	}
		
		wb.close();
		input.close();

}
}