package Test_NG_Framework_2;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_GetDataFromExcel2 {
	
	
	public static String[][] readData(String fileName) throws IOException {
		
		//set up the path for the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data_Selenium/"+fileName+".xlsx");
		
		//get into to the specific sheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//to get the number of rows with data without header
		int rowCount = ws.getLastRowNum();
		 
		//to get the number of rows with data with header
		//int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		
		//to get the number of columns with data 
		int cellcount = ws.getRow(0).getLastCellNum();
		
		
		String[][] data = new String[rowCount][cellcount];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellcount; j++) {
				XSSFRow row = ws.getRow(i);
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1] [j] = cellValue;				
			}
		}	
		wb.close();
		return data;
	}

}
