package com.testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.sql.RowIdLifetime;

import org.apache.bcel.classfile.Constant;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.org.apache.bcel.internal.classfile.ConstantDouble;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	public static void setExcelFile(String path, String sheetName) throws IOException
	{
		FileInputStream file = new FileInputStream(path);

		ExcelWBook = new XSSFWorkbook(file);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
	}
	public static String getCellData(int rows, int col){
		Cell =ExcelWSheet.getRow(rows).getCell(col);
		String CellData = Cell.getStringCellValue();
		return CellData;

	}

	public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

			try{
  			Row  = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum);
			if (Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
				} else {
					Cell.setCellValue(Result);
				}
			FileOutputStream fileOut = new FileOutputStream(Constants.path_aayush + Constants.file);
			
				ExcelWBook.write(fileOut);
				fileOut.flush();
				fileOut.close();
			}catch(Exception e){
				throw (e);
	}
}


//XSSFCell cell;
//xssfrow row;
//String path= "";
//String sheetname = "";
//
//method(String path, String sheetname){
//Fileinputstream stream = new fileinputstream(path)
//XSSFWorkbook workbook = new xssfworkbook(file);
//xssfworksheet = workbook.getsheet(sheet);
//cell = sheet.getrows.getcell;
//string celldata= cell.getcelldata;
//
//cell.setCellValue(value);
//
//fileoutputsream file =  new fileoutputstream(path, filename)
//
//workbook.write(file);


}




