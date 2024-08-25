package package2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] read() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./CreateLead2.xlsx");
		XSSFSheet ws = wb.getSheetAt(0);
		int rowCount = ws.getLastRowNum();
		int cellCount = ws.getRow(0).getLastCellNum();
		
		String[] [] data = new String [rowCount] [cellCount];
		
		for (int i = 1; i <= rowCount ; i++) {
			for (int j = 0; j < cellCount; j++) {
					XSSFRow row = ws.getRow(i);
					XSSFCell cell = row.getCell(j);
					String stringCellValue = cell.getStringCellValue();
					data [i-1] [j] = stringCellValue;
			}
		}
		
		wb.close();
		
		return data;
	}
}
