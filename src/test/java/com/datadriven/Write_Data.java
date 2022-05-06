package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;


public class Write_Data {
	
	
	private static void Write_Data() throws IOException {
		File f= new File("C:\\Users\\welcome\\eclipse-workspace\\Mav_Project\\Excel\\Write.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		wb.createSheet("Student").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("Student").getRow(0).createCell(1).setCellValue("Gender");
		wb.getSheet("Student").createRow(1).createCell(0).setCellValue("Banil");
		wb.getSheet("Student").getRow(1).createCell(1).setCellValue("Female");
		FileOutputStream fos= new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Successfully written");
	//System.exit(0);
		
	}
	public static void main(String[] args) throws IOException {
		Write_Data();
}
}