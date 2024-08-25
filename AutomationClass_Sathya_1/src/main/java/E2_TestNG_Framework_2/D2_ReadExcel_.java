package E2_TestNG_Framework_2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class D2_ReadExcel_ {

	//read data from first column with row details 1 & 2
	public static void main(String[] args) throws IOException {
		
		//set up path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//Get into the respective sheet
		XSSFSheet ws = wb.getSheetAt(0);
		
		//Get into the specific row
		for (int i = 1; i <= 2; i++) {
			XSSFRow row = ws.getRow(i);
			XSSFCell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			System.out.println(data);
		}
				//close the workbook
		wb.close();

	}

}
