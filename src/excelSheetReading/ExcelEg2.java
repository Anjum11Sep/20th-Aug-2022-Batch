package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Users\\Anjum\\ExcelJar_files\\Anjum.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		
		//String cell type
		
		 Cell myCell1 = mySheet.getRow(0).getCell(0);
		 
		 System.out.println(myCell1.getCellType());
		 
		 String myValue1 = myCell1.getStringCellValue();
		
		System.out.println(myValue1);
		
		System.out.println("======================================================================");
		
		
		//Boolean cell type
		
		Cell myCell2 = mySheet.getRow(0).getCell(1);
		
		System.out.println(myCell2.getCellType());
		
		boolean myValue2 = myCell2.getBooleanCellValue();
		
		System.out.println(myValue2);
		
		System.out.println("==========================================================================");
		
		
		//Numeric cell type
		
		Cell myCell3 = mySheet.getRow(0).getCell(2);
		
		System.out.println(myCell3.getCellType());                       //shows datatype of value
		
		double myValue3 = myCell3.getNumericCellValue();          //always numeric value in double, if need to convert use typecasting
		
		System.out.println(myValue3);
		
		int b=(int) myValue3;
		System.out.println(b);
		
		System.out.println("==================================================================");
		
		
        Cell myCell4 = mySheet.getRow(0).getCell(3);
		
		System.out.println(myCell4.getCellType());
		
		String myValue4 = myCell4.getStringCellValue();
		
		System.out.println(myValue4);
		
		System.out.println("====================================================");
		
		System.out.println(mySheet.getRow(0).getCell(1).getCellType());
		
	}

}
