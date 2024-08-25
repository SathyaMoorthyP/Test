package feb01_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mytra_Action {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
		//driver.switchTo().frame(0);
		Actions builder = new Actions(driver);
		//WebElement one = driver.findElement(By.xpath("//div[@id='draggable']"));
		//WebElement two = driver.findElement(By.xpath("//div[@id='droppable']"));
		builder.click(element).perform();
		//builder.doubleClick(element).perform();
		
		
		//builder.dragAndDrop(one, two).perform();
	}

}
