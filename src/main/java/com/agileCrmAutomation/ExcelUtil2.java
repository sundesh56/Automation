package com.agileCrmAutomation;





import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil2 {
	
	private String getFileExtension(String filePath) {
		//get the file path extension
		
		String extension = filePath.substring(filePath.indexOf("."));
		System.out.println(extension);
		return extension;
		
	}
	
	
	private Workbook getWorkbookInstance(String filePath) throws IOException {
		Workbook wb;
		
		FileInputStream input = new FileInputStream(filePath);
		
		// based on the file extension take the control of workbook
		if(getFileExtension(filePath).equals(".xlsx")) {
			wb = new XSSFWorkbook(input);
			
		} else {
			
			wb = new HSSFWorkbook(input);
		}
		return wb;
		
	}
	
	/* method to get sheet ref from the workbook instance */
	
	private Sheet getSheet(String filePath, String sheetName) {
		Sheet sheet = null;
		try {
			Workbook wb = getWorkbookInstance(filePath);
			sheet = wb.getSheet(sheetName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sheet;
	}
	
	
	
	public Object[][] getExcelData(String filaPath, String sheetName) {
		Sheet sheet = getSheet(filaPath, sheetName);
		int totalRow = sheet.getPhysicalNumberOfRows();
		int totalColumn = sheet.getRow(0).getPhysicalNumberOfCells();
		return getCellValue(sheet, totalRow, totalColumn);
		
			
	}
	
	
	private Object[][] getCellValue(Sheet sheet, int totalRow, int totalColumn ){
		Object[][] value = new Object[totalRow][totalColumn];
		for(int i=1; i <totalRow; i++) {
			
			//take control on rows based on the i value
			Row row = sheet.getRow(i);
			
			for(int j=0; j<totalColumn; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType type = cell.getCellType();
				
				
				switch (type) {
				
				case STRING:
					value[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					value[i][j] = cell.getStringCellValue();
					break;
				case BOOLEAN:
					value[i][j] = cell.getStringCellValue();
					break;
				case _NONE:
					value[i][j] = null;
					break;
				case BLANK:
					value[i][j] = null;
					break;
				default:
					value[i][j] = null;
															
				}			
				
			}
		}
		
		
		return value;
		
	}
	
	
	public static void main(String[] args)throws IOException {
		
		String filePath = "D:\\Automation\\TestData.xlsx";
		ExcelUtil2  excelValues = new ExcelUtil2();
		Object[][] data = excelValues.getExcelData(filePath, "LoginTestData");
		
		
		int rowLenght = data.length;
		int columnLenght = 2;
		for(int i=1; i < rowLenght - 1; i++ ) {
			
			for(int j=0; j < columnLenght; j++ ) {
			
			System.out.println(data[i][j]);
		}
		
		
		
		}
		
		
		
	}
	
	
	
}