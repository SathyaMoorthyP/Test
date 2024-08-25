package Test_NG_FrameWork_2;
// 1st

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Provider_Login_Provider_2 {
	
	public WebDriver driver;
	
	@Test(dataProvider = "fetch data")
	public void mainCodes(String url, String username, String passowrd, String cName , String fName, String lName) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(passowrd);
		
		driver.findElement(By.className("decorativeSubmit")).click();

		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		
		driver.findElement(By.name("submitButton")).click();
	}
		
		@DataProvider(name="fetch data")
		public static String[][] setDataa() throws IOException {
			

//		
//		data [0] [0] ="http://leaftaps.com/opentaps/control/main";
//		data [0] [1] ="DemoSalesManager";
//		data [0] [2] = "crmsfa";
//		data [0] [3] = "Google";
//		data [0] [4] = "Narayanan";
//		data [0] [5] = "D";
//		
////		data [1] [0] ="http://leaftaps.com/opentaps/control/main";
////		data [1] [1] ="DemoSalesManager";
////		data [1] [2] = "crmsfa";
////		data [1] [3] = "Yahoo";
////		data [1] [4] = "Sathya";
////		data [1] [5] = "P";		
//		return data;
//		
//		}
			XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Admin\\Desktop\\DataProvider.xlsx");
			XSSFSheet ws = wb.getSheet("Sheet1");
			int lastRowNum = ws.getLastRowNum();
			int lastCellNum = ws.getRow(0).getLastCellNum();

			String [] [] data = new String [lastRowNum] [lastCellNum];
			
			for (int i = 1; i <= lastRowNum; i++) {
				for (int j = 0; j < lastCellNum; j++) {
					XSSFRow row = ws.getRow(i);
					XSSFCell cell = row.getCell(j);
					String cellvalue = cell.getStringCellValue();
					data[i-1][j] = cellvalue; 
				}
			}
		wb.close();
		
		String[][] data1 = ReadExcel_Loop.readData();
		return data1;	
		}
}
