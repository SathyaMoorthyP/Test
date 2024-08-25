package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchWeb 
{

	public static void main(String[] args) throws InterruptedException {
		
      WebDriverManager.chromedriver().setup();
      
      ChromeDriver driver = new ChromeDriver();
      
      driver.get("https://www.google.co.in/");
      
      driver.manage().window().maximize();
      
      Thread.sleep(3000);
      
      driver.close();
}	
}
