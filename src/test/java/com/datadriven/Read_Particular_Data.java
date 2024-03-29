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

public class Read_Particular_Data {

	private static void read_Particular_Data() throws IOException {
		
		File fileLocation= new File("C:\\Users\\welcome\\eclipse-workspace\\Mav_Project\\Excel\\Read.xlsx");
		
		FileInputStream f= new FileInputStream(fileLocation);
		Workbook wbook= new XSSFWorkbook(f);
		Sheet sheetAt = wbook.getSheetAt(0);
	Row row = sheetAt.getRow(0);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
			else if(cellType.equals(CellType.NUMERIC)) {
				 double numericCellValue = cell.getNumericCellValue();
				 int data =(int) numericCellValue;
				System.out.println(data);
			
		}
			
	}
	
	
	public static void main(String[] args) throws IOException {
		read_Particular_Data();
		
	}
}



