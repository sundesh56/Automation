package com.agileCrmAutomation;





import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	static Workbook wb;

	public static void main(String[] args) throws IOException {
		
		//FilePath
		String filePath = "D:\\Automation\\TestData.xlsx";
		
		
		// get the filePath
		String extension = filePath.substring(filePath.indexOf("."));
		System.out.println(extension);
			
		
		//get the control of the file
		FileInputStream input = new FileInputStream(filePath);
		
		 	
		//based on the file extension, take the control of workbook	
		if(extension.equals(".xlsx")) {
			
			wb = new XSSFWorkbook(input);
		}else {
			
			wb = new HSSFWorkbook(input);
		}
		
		// take control on sheet using workbook reference
		  Sheet sheet = wb.getSheet("LoginTestData");
		  
		  //get total no of rows from the sheet
		  int totalRows = sheet.getPhysicalNumberOfRows();
		  
		  int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();		  
		  
		  
		  for(int i=1; i<totalRows; i++) {
			
		//take control of rows based in the i value
		  Row row = sheet.getRow(i);
	        
	        
	        for(int j=0;j<totalColumns; j++) 
	        {
	        	//take control of cell using row ref
	        	Cell cell=row.getCell(j);
	        	
	        	
	        	//get the cell value using cell ref
	        	String value = cell.getStringCellValue();
	        	System.out.println(value);
	        	
	        }
	

	}
		
		wb.close();
		input.close();

}
}