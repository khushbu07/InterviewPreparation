


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RerunFailed {

	@Test
	public void test1() {
		System.out.println("Execute the test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Execute the test2");
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(true);
		System.out.println("Execute the test3");
		 Reporter.log("We used Google Chrome Ver 80 for this test");
	}
}
