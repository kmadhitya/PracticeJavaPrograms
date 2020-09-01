package com.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static Object[][] excelData(String excelFileName) throws IOException
	{
		XSSFWorkbook book = new XSSFWorkbook("./datasheets/"+excelFileName+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		int lastColumn = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[lastRow][lastColumn];
		
		for (int i=1; i<=lastRow; i++)
		{
			XSSFRow row = sheet.getRow(i);
			for (int j=0; j<lastColumn; j++)
			{
				data[i-1][j] = row.getCell(j).getStringCellValue();
			}
		}
		book.close();
		return data;
		
	}

}
