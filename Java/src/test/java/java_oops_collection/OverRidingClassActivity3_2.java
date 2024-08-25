package java_oops_collection;

public class OverRidingClassActivity3_2 extends OverRidingClassActivity3 {
	
	public void addition() {
		int a = 10;
		int b = 5;
		int c = a+b;
		System.out.println("OverRidingClassActivity3 "+c);
	}
		
	public static void main(String[] args) {
		
		OverRidingClassActivity3_2 obj = new OverRidingClassActivity3_2();
		obj.addition();
	}
	
//	private void takeVideos() {
//
//		System.out.println("Take Video 2");
//	}
//
//	public static void main(String[] args) {
//		
//		OverRidingClassActivity3_2 obj = new OverRidingClassActivity3_2();
//				obj.takeVideos();
//	}
}
