package E2_TestNG_Framework_2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class D3_ReadExcel {

	//read data from the row as well as column from excel
	public static void main(String[] args) throws IOException {
		
		//set up path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//Get into the respective sheet
		XSSFSheet ws = wb.getSheetAt(0);
		
		// to get the number of rows with data
		int rowCount = ws.getLastRowNum();
		
		// to get the number of columns with data
		int lastCellNum = ws.getRow(0).getLastCellNum();
		
		//Get into the specific row
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < lastCellNum; j++) {
			XSSFRow row = ws.getRow(i);
			XSSFCell cell = row.getCell(j);
			String data = cell.getStringCellValue();
			System.out.println(data);
		}	
		}
				//close the workbook
		wb.close();

	}

}
