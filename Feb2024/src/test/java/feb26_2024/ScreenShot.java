package feb26_2024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot {

	public static void main (String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/new1.png");
		FileUtils.copyFile(source, dest);
		
		
		
//		File source = driver.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./snaps/irctc.png");
//		FileUtils.copyFile(source, dest);
	}
	
}
                                                                                                                                                                                                                                                                                                                                                                                                                                