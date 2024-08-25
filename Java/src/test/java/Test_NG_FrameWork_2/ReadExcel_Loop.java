package Test_NG_FrameWork_2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_Loop {

	public static String[] [] readData() throws IOException {
		
		//set up the path for the workbook
		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Admin\\Desktop\\Jave_Excel.xlsx");
	
		//Get into the respective sheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//Get last row
		int rowNum = ws.getLastRowNum();
		
		//Get the number of columns in data
		int lastCellNum = ws.getRow(0).getLastCellNum();
		
		//Get into the specific row
		for (int i = 0; i <= rowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				XSSFRow row = ws.getRow(i);
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
			System.out.println(data);
			}
//			XSSFRow row = ws.getRow(i);
//			XSSFCell cell = row.getCell(0);
//			String value = cell.getStringCellValue();
//			System.out.println(value);
//		}
//		
		//close the sheet
		wb.close();
		
			
	}
		return null;

	}
}
