package com.flightbooking.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	 private static XSSFWorkbook WrkBook;
	 private static XSSFSheet WorkSheet;
	 private static XSSFCell excelcell;
	 
	 public static void getWorksheet(String path,String Wrksheet) throws Exception{
		 
		 try{
				FileInputStream excelfile=new FileInputStream(path);
				WrkBook=new XSSFWorkbook(excelfile);
				 WorkSheet=WrkBook.getSheet(Wrksheet);
				
		 }catch(Exception e){
			 throw(e);
			}
		 }
	
	 public static String getCelldata(int RowNum,int ColNum){
		 
		 String strCellData;
		 
		 try{
			 excelcell= WorkSheet.getRow(RowNum).getCell(ColNum);					
			strCellData=excelcell.getStringCellValue();
				
		 }catch(Exception e1){
			 return "";	 
			 
		 }
		return strCellData;	

	 }
	 
	 public static void setCelldata(String Result,int RowNum,int ColNum)throws Exception{
		 
		 try{
		XSSFRow excelRow= WorkSheet.getRow(RowNum);
		excelcell=excelRow.getCell(ColNum, excelRow.RETURN_BLANK_AS_NULL);
		
		if(excelcell==null){
			
			excelcell=excelRow.createCell(ColNum);
			
			excelcell.setCellValue(Result);
		}
		else{
			
			excelcell.setCellValue(Result);
		}
		FileOutputStream excelfilout=new FileOutputStream("Relativepath");
		
		WrkBook.write(excelfilout);
		excelfilout.flush();
		excelfilout.close();
		
		 }catch(Exception e){
			 throw(e);
		 }
		
		
		
		 
	 }
	 
	 
	 

}
