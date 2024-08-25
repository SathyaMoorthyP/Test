package C1_java_oops_and_collection;

public class F2_MyBank extends F1_YesBank {

		public void maxLoanAmount() {
		System.out.println("5000000");
		
	}
	
	public static void main(String[] args) {
		
		F2_MyBank ban = new F2_MyBank();
		ban.minBalance();
		ban.maxLoanAmount();
	
	}

}
