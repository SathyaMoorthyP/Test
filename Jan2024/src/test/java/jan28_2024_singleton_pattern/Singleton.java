package jan28_2024_singleton_pattern;

public class Singleton {
	
	 //step1: Declaring singleton object as private
	private static Singleton singleton;
	
	//step2: Creating the private constructors
	private Singleton() {
		
	}
	
	//stpe3: Create a static method to get the instance
	public static Singleton getInstanceSingleton() {
		if(singleton == null)
		{
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void displayMessage() {
		System.out.println("I have called using Singleton object");
	}

}