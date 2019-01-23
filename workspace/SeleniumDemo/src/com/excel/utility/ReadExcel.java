package com.excel.utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.CellType;

public class ReadExcel 
{
	String filePath = "C:\\Users\\Samsung\\workspace\\SeleniumDemo\\src\\com\\exceldata\\Book1.xlsx";
	
	FileInputStream fis;
	XSSFWorkbook wb;	
	XSSFSheet sheet;	
	XSSFRow row;
	XSSFCell cell;
	
	public ReadExcel(int sheetNumber) 
	{
		try 
		{
			fis = new FileInputStream(filePath);
			wb= new XSSFWorkbook(fis);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		sheet =wb.getSheetAt(sheetNumber);
	}
	
	public String readData(int rowNum, int colNum)
	{
		String data=null;
		
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		data = cell.getStringCellValue();
		/*if (cell.getCellTypeEnum()==CellType.STRING)
		{
			data = cell.getStringCellValue();			
		}
		else if (cell.getCellTypeEnum()==CellType.NUMERIC)
		{
			data = String.valueOf((long)cell.getNumericCellValue());			
		}*/
		return data;
	}
	
	public int rowCount() 
	{
		int rows =sheet.getLastRowNum()+1;
		return rows;
	}
	
	public int colCount()
	{
		row = sheet.getRow(0);
		int cols = row.getLastCellNum();
		return cols;		
	}
	public static void main(String[] args) {
		ReadExcel reader=new ReadExcel(0);
		int cols =reader.colCount();
		int rows = reader.rowCount();
		Object data[][] = new Object[rows][cols];
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j <cols; j++) 
			{
				 data[i][j]=reader.readData(i, j);	
				 System.out.println(data[i][j]);
				 
			}
			
		}
		

	}
}
