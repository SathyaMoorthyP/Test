package feb15_2024;

public class StringArray {

	public static void main(String[] args) {

		//method1 - using concatenation 
		
		String str = "ABCD";
		String rev = "";
		
//		int len = str.length(); //4
//			for (int i = len-1; i >=0; i--) {
//				rev = rev + str.charAt(i); //D C B A
//			}
//			System.out.println(rev);	
//	}

		//method 2 char array
		
		/*char[] cs = str.toCharArray();
		int len2 = cs.length; //4
		
		for (int i = len2-1; i >= 0; i--) {
			rev = rev + cs[i];
		}
		
		System.out.println(rev);
		
	}*/

		//method 3 using String buffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	
	}
}