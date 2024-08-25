package E2_TestNG_Framework_2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E1_ReadExcel {
	
	//E1 & E2 combining data provider and readdata file from excel

	//read data from the row as well as column from excel
	public static String[][] readData() throws IOException {
		
		//set up path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//Get into the respective sheet
		XSSFSheet ws = wb.getSheetAt(0);
		
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
