package Test_NG_Framework_2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C1_ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//set up the path for the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data_Selenium/CreateLead.xlsx");
		
		//get into to the specific sheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//Get into the specific row
		XSSFRow row = ws.getRow(1);
		
		//Get into the specific cell/column
		XSSFCell cell = row.getCell(0);
		
		//Read the data from the cell
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		//close the workbook
		wb.close();
	}

}
