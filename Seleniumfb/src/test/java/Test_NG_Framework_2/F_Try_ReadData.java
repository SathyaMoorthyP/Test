package Test_NG_Framework_2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_Try_ReadData {
//	
//	public void openChrome() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//	}

	@Test
	public static void main() throws IOException {
		
		//to set up the path for the workbook
		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Admin\\eclipse-workspace\\Seleniumfb\\target\\test-classes\\Test_NG_Framework_2\\CheckGoogle.xlsx");
		
		//to get into the sheet
		XSSFSheet ws = wb.getSheet("Sheet1");

		//to get the numbers of rows without header
		int lastRowNum = ws.getLastRowNum();
		
		//to get the number of columns with data
		int lastCellNum = ws.getRow(0).getLastCellNum();
		
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {	
				XSSFRow row = ws.getRow(i);
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			
		}
		
		wb.close();
	}
	
}
