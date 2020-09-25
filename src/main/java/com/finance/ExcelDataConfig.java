package com.finance;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet_name;
	private static FileInputStream fis;
	
	public static void main(String args[]) throws IOException {
		excelSheetData("demo");
	}
	public static String[] excelSheetData(String sheetName) throws IOException {
		fis = new FileInputStream("./src/main/java/com/ExcelData/Test_Case.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet_name = wb.getSheet(sheetName);
		int rows = sheet_name.getLastRowNum();
		int coulmn = sheet_name.getRow(0).getPhysicalNumberOfCells();
		String[] s= {"Dominic","Xavier"};
		return s;
	}
}
