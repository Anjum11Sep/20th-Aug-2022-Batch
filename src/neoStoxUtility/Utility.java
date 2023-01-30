package neoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	
	//excel
	//wait
	//screenshot
	//scrollIntoView
	//reading data from property file(write click on package-> go to new option->others-> click on file-> select package->give name with extension .properties(property.properties)->finish
	//give data in pair of key,value in property file
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		//1. create an object of properties file
		Properties prop=new Properties();
		//2. create object of fileInputStream
		FileInputStream myFile=new FileInputStream("C:\\Users\\Anjum\\eclipse-workspace\\selenium_project\\src\\neoStoxUtility\\PropertyFile.properties");
		//3. load file
	     prop.load(myFile);
		//4. read data from file
		 String value = prop.getProperty(key);
		 Reporter.log("Reading data from property file", true);
		 Reporter.log("data is "+value, true);
		return value;
		
	}
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\Anjum\\ExcelJar_files\\Anjum.xlsx");
		
		  Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		  
		 String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		 
		 Reporter.log("data is "+value, true);
		 return value;
	}
	
	public static void implicitWait(int time,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("waiting for "+time+"ms", true);
	}
	
	public static void takesScreenshot(WebDriver driver, String fileName) throws IOException
	{
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Anjum\\eclipse-workspace\\selenium_project\\ScreenshotEg\\"+fileName+".jpg");
		FileHandler.copy(Source, dest);
		Reporter.log("Taking Screenshot");
		Reporter.log("screenshot taken and saved at "+dest, true);
		
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		Reporter.log("scrolling into view to "+element.getText(), true);
	}



}
