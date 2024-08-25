package A2_JavaBasic2;
//13 
import java.util.Arrays;
public class D1_LearnArray {
	public static void main(String[] args) {
//      array declaration // index starts from 0, length-1
//		int[] values = new int[3];
//		values[0] = 20;
//		values[1] = 10;
//		values[2] = 30;

		int[] values = {20, 10, 30, 50}; 
		
		int noOfData = values.length;
		System.out.println(noOfData);
		
		//System.out.println(values[2]); //to find the values from single index
		
		//to sort the data in ascending order
		Arrays.sort(values); //10,20,30,50
		
		//0,1,2,3
		for (int i = 0; i < noOfData; i++) { 
			System.out.println(values[i]);		
		}
	}

}
