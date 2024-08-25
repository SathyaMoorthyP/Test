package feb28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		//1.Scroll by using pixel
		//js.executeScript("window.scrollBy(0,1000)","");
		
		//2.scroll page till we find element
		WebElement scr = driver.findElement(By.xpath("//a[@alt=\"IRCTCofficial youtube\"]"));
		js.executeScript("arguments[0].scrollIntoView();", scr);
		
		//3.Scroll down to the webpage
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		
		
		//4.Scroll up to the webpage
		//js.executeScript("window.scrollTo(0,0)","");
}
}