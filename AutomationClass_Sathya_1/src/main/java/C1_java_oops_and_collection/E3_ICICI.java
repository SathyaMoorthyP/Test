package C1_java_oops_and_collection;

public class E3_ICICI implements E1_RBI{

	public void minBalance() {
		System.out.println("Minimum balance to maintain is 2000");
	}

	public void maxLoanAmount() {
		System.out.println("Maximum Loan amount for bank to provide is 500000");
	}

	public void maxHomeLoanAmount() {
		System.out.println("Maximum Home Loan amount for bank to provide is 5000000");
	}
	
	public static void main(String[] args) {
		
		E3_ICICI icici = new E3_ICICI();
		icici.maxLoanAmount();
		icici.minBalance();
		icici.maxHomeLoanAmount();
		
		// interface and class name
		
		E1_RBI bank = new E3_ICICI();
		// max loan amount will not be called
		
	}
}
