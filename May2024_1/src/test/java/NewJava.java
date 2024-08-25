import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

//Move all negative numbers to beginning and positive to end
public class NewJava {
	public static void main(String[] args) {
		int[] arr = {-1, -3, 4, 6, -1, 4, -3};
		int j=0, temp=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					temp = arr[i]; //-5
					arr[i] = arr[j]; //1
					arr[j] = temp; //-5
				}
				j++;
			} 
		}
		System.out.println(Arrays.toString(arr));
		}	
	}
