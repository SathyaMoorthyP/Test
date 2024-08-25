package AutomationFB;

public class LearnString {
	
	public static void main(String[] args) {
		
	String s1 = "SATHYA";
	String s2 = "sathya moorthy p";
	
	boolean che = s1.equals(s2);
	boolean che2 = s1.equalsIgnoreCase(s2);
	System.out.println(che);
	System.out.println(che2);
	
	int ind = s1.length();
	System.out.println(ind);
	
    int ind2 = s2.length();
System.out.println(ind2);
	}
}
