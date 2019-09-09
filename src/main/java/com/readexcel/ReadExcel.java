package com.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcel {
	
	public static Workbook book;
	public static Sheet sheet;


	public final static String excelFilePath ="/home/anita/eclipse-workspace/com.readexcel/sheets/DataEngine.xls";


	public static void main(String[] args) {
		
        FileInputStream file=null;
		try {
			file = new FileInputStream(new File(excelFilePath));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
         
        try {
        	book=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sheet=book.getSheetAt(0);
		int k=0;
		for(int i=0;i<sheet.getLastRowNum();i++)
        {
			System.out.print(sheet.getRow(i).getCell(k));
			System.out.print(sheet.getRow(i).getCell(k+1).toString().trim());
			System.out.println();
			
	    }
       
		
	}

}
