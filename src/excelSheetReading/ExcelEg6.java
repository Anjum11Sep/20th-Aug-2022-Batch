package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
         
		File myFile=new File("C:\\Users\\Anjum\\ExcelJar_files\\Anjum.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		
		for(int row=0;row<=1;row++)
		{
			for(int cell=0;cell<=2;cell++)
			{
				Cell myType = mySheet.getRow(row).getCell(cell);    //reducing the code by storing duplicate value in 1 variable
				CellType type = mySheet.getRow(row).getCell(cell).getCellType();
				
				if(type==CellType.STRING)
				{
					System.out.print(myType.getStringCellValue() +" ");
				}
				else if(type==CellType.NUMERIC)
				{
					System.out.print(myType.getNumericCellValue() +" ");
				}
				else if(type==CellType.BOOLEAN)
				{
					System.out.print(myType.getBooleanCellValue() +" ");
				}
				else if(type==CellType.BLANK)
				{
					System.out.println("Blank");
				}
			}
			System.out.println();
		}
	}

}
