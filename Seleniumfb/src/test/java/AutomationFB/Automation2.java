package AutomationFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.vista.adp.com/vista/index.html?TYPE=33554433&REALMOID=06-00056349-5d04-1f8a-bae3-1b780aca0000&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-8JQf4lcG7lNB20iq7g1y%2FtWL51TQprmcOZPTAp8da91%2FkmFDMIERHoHYiZqg1TKY&TARGET=-SM-https:%2F%2Fwww.vista.adp.com%2FESS4%2FESSV5%2Freports");
	
		driver.findElement(By.cssSelector("input [placeholder = 'CLient ID']")).sendKeys("AGS");
	}

}
