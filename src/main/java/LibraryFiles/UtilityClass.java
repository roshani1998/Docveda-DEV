package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{

	//Author Roshani Ghotekar
	//Code to get data and to get SS of failed test cases 
	public static String GetTD(int rowIndex, int cellIndex) throws IOException 
	{
	    FileInputStream file=new FileInputStream("C:\\Users\\h\\eclipse-workspace\\Docveda-DEV\\TestData\\Dev data.xlsx");
	    
	   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	   
	   String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	   
	   return value;
	    
	}
	
	public static String GetPFD(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\h\\eclipse-workspace\\Docveda-DEV\\PropertyFile.properties");
		
		Properties p=new Properties();
		
		p.load(file);
		
		 String value = p.getProperty(key);
		 
		 return value;
		
	}
	
	public static void CaptureSS(WebDriver driver, int TCIDNumber) throws IOException 
	{
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\h\\eclipse-workspace\\Docveda-DEV\\FailedTCSS\\TestCaseId"+ TCIDNumber + ".png");
		
		FileHandler.copy(src, dest);
		
	}
}
