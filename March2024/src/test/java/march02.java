import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class march02 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']"));
		name.sendKeys("Sathya Moorthy P");
		
		WebElement country = driver.findElement(By.xpath("//input[@value='Chennai']"));
		country.clear();
		country.sendKeys("Madipakkam");
		
		boolean enableed = driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled();
		System.err.println(enableed);
		
		WebElement cle = driver.findElement(By.xpath("//input[@value='Can you clear me, please?']"));
		cle.clear();
		
		String text = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getText();
		System.out.println(text);

		driver.findElement(By.xpath("//input[contains(@placeholder,'Your email')]")).sendKeys("sathya@gmail.com"+Keys.TAB);
		
		driver.findElement(By.xpath("//textarea[contains(@placeholder,'About')]")).sendKeys("Hi !");
		
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']/div[@class='ql-editor ql-blank']")).sendKeys("I have successfully completed the above 1st columns");
		
		WebElement ke = driver.findElement(By.xpath("//input[contains(@id,'thisform:')]"));
		ke.sendKeys(Keys.ENTER);
		
		WebElement err = driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
		if(err.isDisplayed()) {
			System.err.println(true);
		}
		else {
			System.out.println(false);
		}
		
		WebElement doe = driver.findElement(By.xpath("//label[text()='Username']"));
		doe.sendKeys(Keys.ENTER);
	}

}
