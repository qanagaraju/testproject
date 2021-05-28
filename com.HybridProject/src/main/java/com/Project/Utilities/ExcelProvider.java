package com.Project.Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProvider {
	
	
	public static XSSFWorkbook wb ;
	
	
	public ExcelProvider() {
		
		
		try {
			
			File file = new File("./appFiles/loginFile.xlsx");
			FileInputStream fis = new FileInputStream(file);
			
			wb = new XSSFWorkbook(fis);
			
			
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	
	
	public String getstring(String sheetname,int rownum,int column) {
		return wb.getSheet(sheetname).getRow(rownum).getCell(column).getStringCellValue();
		
	}
	
	public String getstring(int sheetnumber,int rownum,int column) {
		return wb.getSheetAt(sheetnumber).getRow(rownum).getCell(column).getStringCellValue();
		
	}
	

}
