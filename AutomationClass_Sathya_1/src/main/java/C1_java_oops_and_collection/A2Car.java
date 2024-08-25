package C1_java_oops_and_collection;
//2nd

public class A2Car extends A1Vechile {
	
	public void opensunRoof() {
		System.out.println("Open Sun Roof");
	}
	
	public static void main(String[] args) {
		A2Car car = new A2Car();
		car.opensunRoof();
		car.soundHorn();
		car.applyBrake();
		
	}
}
