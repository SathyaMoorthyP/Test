import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_August_1 {
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml;jsessionid=node01vi0ndytm22chq1wzbb5cor0e5109697.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String row1 = driver.findElement(By.xpath("//table[@role='grid']/thead[@class='ui-datatable-scrollable-theadclone']/following-sibling::tbody/tr[1]/td[1]")).getText();
		System.out.println(row1);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@role='grid']/thead[@class='ui-datatable-scrollable-theadclone']/following-sibling::tbody/tr/td[1]"));
		int row = rows.size();
		System.out.println("The number of row" + row);
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@role='grid']/thead[@class='ui-datatable-scrollable-theadclone']/following-sibling::tbody/tr[1]/td"));
		int column = columns.size();
		System.out.println("The number of column" + column);
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				WebElement findElement = driver.findElement(By.xpath("//table[@role='grid']/thead[@class='ui-datatable-scrollable-theadclone']/following-sibling::tbody/tr["+i+"]/td["+j+"]"));
				String text = findElement.getText();
				System.out.println(text);
			}
		}
	}
}
