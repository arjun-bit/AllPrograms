package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Getdata {
	public static void main(String[] args) {
		
	
	String path = "E:\\Arjun\\OneDrive\\Desktop\\Arjun.xlsx"; 
	FileInputStream file = new FileInputStream(path);
	
	String value = WorkbookFactory.create(file).getSheet("Arjun").getRow(2).getCell(0).getStringCellValue();
	System.out.println(value);
	
//	double data = WorkbookFactory.create(file).getSheet("Arjun").getRow(1).getCell(1).getNumericCellValue();
//	System.out.println(data);
//	
//	Date d = WorkbookFactory.create(file).getSheet("Arjun").getRow(6).getCell(1).getDateCellValue();
//	System.out.println(d);
	}
}