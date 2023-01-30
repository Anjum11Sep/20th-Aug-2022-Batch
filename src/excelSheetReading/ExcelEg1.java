package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Users\\Anjum\\ExcelJar_files\\Anjum.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
		System.out.println("Value is "+value);

	}

}
