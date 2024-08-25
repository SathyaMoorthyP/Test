package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	
	//E1 & E2 combining data provider and read data file from excel

	//read data from the row as well as column from excel
	public static String[][] readData(String fileName) throws IOException {
		
		//set up path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//Get into the respective sheet
		XSSFSheet ws = wb.getSheetAt(0);
		//XSSFSheet ws = wb.getSheet("One");
		
		// to get the number of rows with data
		int rowCount = ws.getLastRowNum();
		
		// to get the number of columns with data
		int lastCellNum = ws.getRow(0).getLastCellNum();
		
		String [] [] data = new String[rowCount][lastCellNum];
		//Get into the specific row
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < lastCellNum; j++) {
			XSSFRow row = ws.getRow(i);
			XSSFCell cell = row.getCell(j);
			String cellValue = cell.getStringCellValue();
			data[i-1][j] = cellValue;
		}	
		}
		//close the workbook
		wb.close();
		
		return data;
	}

}
