package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multidata {
	public static void main(String[] args) throws Throwable, IOException    {
		
		
	// How to get the data from excel file.  
	String path = "E:\\Arjun\\OneDrive\\Desktop\\Arjun.xlsx"; 
	FileInputStream file = new FileInputStream(path);
	
	Workbook book = WorkbookFactory.create(file);
	String value = book.getSheet("Arjun").getRow(1).getCell(0).getStringCellValue();
	System.out.println(value);
	
//	 double data = book.getSheet("Velocity").getRow(1).getCell(1).getNumericCellValue();
//	 System.out.println(data);
	
//	 Date d = book.getSheet("Velocity").getRow(6).getCell(1).getDateCellValue();
//	System.out.println(d);
	
	}
}
