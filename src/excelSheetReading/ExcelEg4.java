package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        File myFile=new File("C:\\Users\\Anjum\\ExcelJar_files\\Anjum.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		//read all same type of data from excel
		
		for(int row=1;row<=2;row++)
		{
			for(int cell=0;cell<=2;cell++)
			{
				//read data from sheet
				
				
			   String myValue1 = mySheet.getRow(row).getCell(cell).getStringCellValue();
			   
			   System.out.print(myValue1 +" ");
			}
			System.out.println();
		}

	}

}
