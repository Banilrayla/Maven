package com.datadriven;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
	
	private static void read_All_Data() throws IOException {
		File fileLocation= new File("C:\\Users\\welcome\\eclipse-workspace\\Mav_Project\\Excel\\Read.xlsx");
		FileInputStream f= new FileInputStream(fileLocation);
		Workbook wb= new XSSFWorkbook(f);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
					else if(cellType.equals(CellType.NUMERIC)) {
						 double numericCellValue = cell.getNumericCellValue();
						 int data =(int) numericCellValue;
						System.out.println(data);
						wb.close();
				}
				
				
				
				
		
				
			
				
			}
			
		}
	}



public static void main(String[] args) throws IOException {
	read_All_Data();
	
}
}
