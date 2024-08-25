package SeleniumTrargetLocators;

public class LearnConstructor1 {
	
	String cName = "Google";
	
		
	public LearnConstructor1(String cName) {
		this.cName = cName;
		System.out.println(this.cName);
		
	}
	
	public static void main(String[] args) {
	
	LearnConstructor1 cons = new LearnConstructor1("Test");
		System.out.println(cons.cName);
		
		
	}

}
