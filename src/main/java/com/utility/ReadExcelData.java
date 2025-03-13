package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String readParticularCellData(int rowVal, int colVal) {
		String data = "";
		try {
			File file = new File("C:\\Users\\Rajesh\\Documents\\datadriven\\PremiumIPT.xlsx");
			//WorkBook workbook = new XSSFWorkbook(file);
			Workbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheet("Sheet1");
			Row row = sheet.getRow(rowVal);
			Cell cell = row.getCell(colVal);
			DataFormatter dataformat = new DataFormatter();
			data = dataformat.formatCellValue(cell);
			System.out.println(data);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	public static void  readParticularRowMultiCell() {
		File file = new File("C:\\Users\\Rajesh\\Documents\\datadriven\\PremiumIPT.xlsx");
		try {
			Workbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheet("Sheet1");
			int noOfRows = sheet.getLastRowNum();
			int noOfCols = sheet.getRow(1).getLastCellNum();
			
			System.out.println("no.of rows:"+noOfRows);
			System.out.println("no.of columns:"+noOfCols);
			
			//get a row
			Row row = sheet.getRow(1);
			for(int i = 0; i < noOfCols; i++) {
				Cell cell = row.getCell(i);
				DataFormatter dataformat = new DataFormatter();
				String data = dataformat.formatCellValue(cell);
				System.out.println(data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getAllDada() {
		File file = new File("C:\\Users\\Rajesh\\Documents\\datadriven\\PremiumIPT.xlsx");
		try {
			Workbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheet("Sheet1");
			int noOfRows = sheet.getLastRowNum();
			int noOfCols = sheet.getRow(1).getLastCellNum();
			
			System.out.println("no.of rows:"+noOfRows);
			System.out.println("no.of columns:"+noOfCols);
			
			for(int i = 1; i <= noOfRows; i++) {
				Row row = sheet.getRow(i);
				for(int j=0;j< noOfCols; j++) {
					Cell cell = row.getCell(j);
					DataFormatter dataformat = new DataFormatter();
					String data = dataformat.formatCellValue(cell);
					System.out.println(data);
				}
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void writeData() {
		try {
			File file = new File("C:\\Users\\Rajesh\\Documents\\datadriven\\PremiumIPT.xlsx");
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(inputStream);
			workbook.createSheet("JANIPT").createRow(0).createCell(0).setCellValue("kavitha");
			workbook.getSheet("JANIPT").createRow(1).createCell(0).setCellValue("selenium");
			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);
			workbook.close();
			System.out.println("success");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) throws InvalidFormatException, IOException {
		//readParticularCellData(3,0);
		//readParticularRowMultiCell();
		//getAllDada();
		writeData();
	}

}
