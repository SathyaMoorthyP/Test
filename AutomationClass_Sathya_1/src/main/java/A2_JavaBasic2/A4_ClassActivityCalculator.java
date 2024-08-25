package A2_JavaBasic2;
//3rd class room activity 
//1.Create a class "Java_Basics_2_ClassRoomActivity_1" with below methods.
//(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
//(b) sub(int num1, int num2), it should return subtraction of num1- num2
//(c) mul(double num1, double num2), it should return product of num1* num2
//(d) divide(float num1, flaot num2), it should return division of num1/ num2
//
//2.Create another class as "Java_Basics_2_ClassRoomActivity_1_Continues" call all the methods from "Java_Basics_2_ClassRoomActivity_1" 
//and print the results

public class A4_ClassActivityCalculator {

	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	 public int sub(int num1, int num2){ 
		 return num1 - num2; 
	}
	 
	 public double mul(double num1, double num2) {
		return num1 * num2;
	}
	 
	public float divide(float num1, float num2) {
		return num1 / num2;
	}
}