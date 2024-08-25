 
public class PractiseJava {

	public static void main(String[] args) {
		int vCount= 0, cCount =0; 
		String myName = "Sathya Moorthy P ";
		myName = myName.toLowerCase();
		for(int i=0; i< myName.length(); i++) {
			if(myName.charAt(i)=='a'|| myName.charAt(i) == 'e'|| 
					myName.charAt(i) == 'i'||myName.charAt(i) == 'o'||
					myName.charAt(i) == 'u') {
					vCount++;
			}
			
			else if(myName.charAt(i) >= 'a' && myName.charAt(i) <='z'){ 
					cCount++ ;
			}
		}
		System.out.println("Total number # of vowels  " + vCount);
		System.out.println("Total number # of constants  " + cCount);

	}

}
