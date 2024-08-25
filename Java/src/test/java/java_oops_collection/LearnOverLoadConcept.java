package java_oops_collection;


public class LearnOverLoadConcept {
	
	private void learnOverLoad(int a ,int b) {
		
		int c = a+b;
		System.out.println(c);
		
	}

	private void learnOverLoad(int c) {

		int d = c;
		System.out.println(d);
		
	}
	
	public static void main(String[] args) {
		
		LearnOverLoadConcept check = new LearnOverLoadConcept();
		check.learnOverLoad(5);
		check.learnOverLoad(10, 20);
				
	}
}
