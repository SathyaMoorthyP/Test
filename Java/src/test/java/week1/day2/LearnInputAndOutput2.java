package week1.day2;

public class LearnInputAndOutput2 {
	
	public void sum(int num1, int num2, int num3) {
		
		System.out.println(num1 + num2 + num3);
		
	}
	
	public void getemployeeinfo(String firstname) {
		System.out.println("firstname");
		
	}
	
	public static void main(String[] args) {
		
		LearnInputAndOutput2 liao2 = new LearnInputAndOutput2();
		
	    //call method 
	    liao2.sum(10, 20, 30);
	    liao2.getemployeeinfo("Sathya");
	}
 
}
