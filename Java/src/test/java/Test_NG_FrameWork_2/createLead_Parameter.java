package Test_NG_FrameWork_2;
// 1st

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createLead_Parameter {
	//String url, String firstsearch, String SecondSearch
	@Parameters({"url", "first", "second"})
	@Test
	public void learnParamaters(@Optional("https://www.google.co.in/") String url,@Optional("America") String first,@Optional("canada") String second) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		WebElement FFirst = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		FFirst.sendKeys(first);
		FFirst.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		WebElement Ssecond = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		Ssecond.sendKeys(second);
		Ssecond.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().back();
		driver.close();
	}
}
