package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        File myFile=new File("C:\\Users\\Anjum\\ExcelJar_files\\Anjum.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		for(int i=0;i<=2;i++)
		{
			double NumericValue = mySheet.getRow(1).getCell(i).getNumericCellValue();    ////row is constant and cell is varying
			
			System.out.println(NumericValue);
		}
		
		System.out.println("=========================================");
		
		for(int j=2;j<=4;j++)
		{
			String StringValue = mySheet.getRow(j).getCell(0).getStringCellValue();   //Cell is constant and row is varying
			
			System.out.println(StringValue);
			
		}

	}

}
