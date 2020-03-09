package JUnit;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class OddOrEvenTest {
	OddOrEven obj;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("in After Class");
	}
	
	@Test
	public void testForOdd() {
		System.out.println("in test for Odd");
		int testData=11;
		String expectedResult="Odd";
		OddOrEven obj = new OddOrEven();
		String actualResult=obj.OddOrEven(testData);
		Assert.assertEquals(expectedResult, actualResult);
	
	}
	
	@Test
	public void testForEven() {
		System.out.println("in test for Even");
		int testData=12;
		String expectedResult="Even";
		OddOrEven obj = new OddOrEven();
		String actualResult=obj.OddOrEven(testData);
		Assert.assertEquals(expectedResult, actualResult);
	
	}
	
	@Test(expected=RuntimeException.class)
	public void testForException() {
		System.out.println("in test for Exception");
		int testData=0;
		OddOrEven obj = new OddOrEven();
		String actualResult=obj.OddOrEven(testData);
	
	}
	@Before
	public void setUp() {
		obj = new OddOrEven();
		System.out.println("in Before");
	}
	
	@After
	public void tearDown() {
		obj = null;
		System.out.println("in After");
	}


}
