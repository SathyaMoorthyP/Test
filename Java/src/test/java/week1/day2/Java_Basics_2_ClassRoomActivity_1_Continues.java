package week1.day2;

//Classroom: 

////1.Create a class "Java_Basics_2_ClassRoomActivity_1" with below methods.
////(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
////(b) sub(int num1, int num2), it should return subtraction of num1- num2
////(c) mul(double num1, double num2), it should return product of num1* num2
////(d) divide(float num1, flaot num2), it should return division of num1/ num2
////
////2.Create another class as "Java_Basics_2_ClassRoomActivity_1_Continues" call all the methods from "Java_Basics_2_ClassRoomActivity_1" 
//and print the results

public class Java_Basics_2_ClassRoomActivity_1_Continues {

	public static void main(String[] args) {
		
		Java_Basics_2_ClassRoomActivity_1 call = new Java_Basics_2_ClassRoomActivity_1();
		
		int add = call.add(10, 20, 30);
		int sub = call.sub(50, 20);
		double mul = call.mul(20, 20);
		float divide = call.divide(500, 250);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(divide);

	}

}
