package practise;
		
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
		
	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>();
		languages.add("Tamil");
		languages.add("English");
		languages.add("Hindi");
		languages.add("French");
		languages.add("Tamil");
		languages.add("English");
		languages.add("Hindi");
		languages.add("French");
		
		System.out.println(languages);
		
		languages.remove(3);
		
		System.out.println(languages);
		String string = languages.get(1);
		
		System.err.println(string);	
	}
}
