package week1.day1;

public class Mathematics2 {
	
	int a = 50;
	int b = 100;
	int c;
	
	public void addition () {
		c=b+a;
		System.out.println("Addtion value is "+c);
	}
	
	public void subtraction () {
		c=b-a;
		System.out.println("Subtraction value is "+c);
		
	}
	public void Multiplication () {
		c=b*a;
		System.out.println("Multiplication value is"+c);
	}
	
 public static void main(String[] args) {
	 
	 Mathematics2 three = new Mathematics2();
	 three.addition();
	 three.subtraction();
	 three.Multiplication();
	 
}
}
