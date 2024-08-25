package pacakage3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelP3 {

	public static String[][] checkDat() throws IOException {
		
		//location for the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./CreateLeadData.xlsx");

		//get into the sheet
		XSSFSheet ws = wb.getSheetAt(0);
		
		//get the row count
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		
		//get all cell count
		short cellCount = ws.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		
		String [] []  data = new String [rowCount] [cellCount];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				XSSFRow row = ws.getRow(i);
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data [i-1] [j] = stringCellValue;
			}
		}
		//close workbook
		wb.close();
		
		return data;
	}

}
