package SeleniumTrargetLocators;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Constructor {
	
public ChromeDriver driver;
	
	
	//Default constructor / Constructors are like methods without return type / name of the constructor = name of the class
	public Constructor() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com");
//		System.out.println(super.cName);
		Thread.sleep(2000);
		
	}
	
	public Constructor(String hi) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(hi);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		driver.close();
	}

	
	public static void main(String[] args) {
//		Constructor cons1 = new Constructor();
//		Constructor cons = new Constructor("https://www.facebook.com");
//		cons.method1();	
		
	}

}
