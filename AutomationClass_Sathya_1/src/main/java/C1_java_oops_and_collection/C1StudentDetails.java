package C1_java_oops_and_collection;

//Overloading example, Polymorphism, 

public class C1StudentDetails {

	public void getStudentInfo(String name) {
		System.out.println(name);
	}
	
	public void getStudentInfo(int stdID) {
		System.out.println(stdID);
	}

	public void getStudentInfo(int stdID, String name) {
		System.out.println(stdID + name);
	}
	
	public static void main(String[] args) {
		
		C1StudentDetails details = new C1StudentDetails();
		details.getStudentInfo(2, "Narayana");
		details.getStudentInfo(7);
		details.getStudentInfo("Sathya");
		
	}
}
