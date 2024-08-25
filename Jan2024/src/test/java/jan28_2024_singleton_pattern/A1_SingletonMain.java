package jan28_2024_singleton_pattern;

public class A1_SingletonMain {
	
	public static void main(String[] args) {
		
	
	// not possible to create an object using new keyword because the constructor is priavte
   // Singleton singleton = new Singleton();
	
		
	Singleton singleton1 = Singleton.getInstanceSingleton();
	
	Singleton singleton2 = Singleton.getInstanceSingleton();
	
	//singleton1 , singleton2 two reference variable but points to one object
	
	singleton1.displayMessage();
	singleton2.displayMessage();
	
	}
}
