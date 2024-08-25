package D2_Selenium_Target_Locators;
import org.openqa.selenium.chrome.ChromeDriver;
public class A1_Constructors {
	
	//default constructor looks like
	public A1_Constructors() {
		System.out.println("Sathya");
	}

	public A1_Constructors(String args) {
		System.out.println(args);
	}
	
	public void method2() {
		System.out.println("Narayanan");

	}
	
	public static void main(String[] args) {
		
		A1_Constructors cons = new A1_Constructors("naresh");
		cons.method2();
		
		//ChromeDriver driver = new ChromeDriver();
		
		A1_Constructors Defaultcons = new A1_Constructors();
	}

}
