package stepDefintions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class B1_Assertion {

	@Test
	public void main() {

		String s1 = "Test Leaf";
		String s2 = "Test LeaF";
		
		//Hard Assertion
		Assert.assertEquals(s1, s2);
		//Assert.assertTrue(s1.equals(s2));
		//Assert.assertFalse(s1.contains(s2));
		
		//Soft Assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(s1, s2);
		
		System.out.println("Last Line of Code");
	}

}
