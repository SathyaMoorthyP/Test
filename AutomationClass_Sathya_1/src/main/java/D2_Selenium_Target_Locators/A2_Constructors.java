package D2_Selenium_Target_Locators;
import org.openqa.selenium.chrome.ChromeDriver;
public class A2_Constructors {
	
	String Sname = "Sai School";
	

	public A2_Constructors(String Sname){
		this.Sname = Sname;
		System.out.println(Sname);
	}
	
	
	public static void main(String[] args) {
		
		A2_Constructors cons = new A2_Constructors("hi");
		
	}

}
