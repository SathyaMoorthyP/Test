package Test_NG_FrameWork_2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//set up the path for the workbook
		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Admin\\Desktop\\Jave_Excel.xlsx");
	
		//Get into the respective sheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//Get into the specific row
		XSSFRow row = ws.getRow(1);
		
		//Get into the specific cell
		XSSFCell cell = row.getCell(0);
		
		//Read the date from the cell
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		//close the sheet
		wb.close();
		
			
	}

}
