package march21;

public class PassOutputToAMethod {

	public int su(int a, int b, int c) {
		int result = a+b+c;
		System.out.println(result);
		return result;

	}
	public static void main(String[] args) {
		PassOutputToAMethod ne = new PassOutputToAMethod();
		int result1 = ne.su(1, 1, 1);
		System.out.println(result1/1);
	}

}
