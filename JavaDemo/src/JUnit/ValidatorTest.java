package JUnit;

import org.junit.Test;

import junit.framework.Assert;

public class ValidatorTest {
	
	@Test
	public void testForFalse() {
		Validator v=new Validator();
		boolean flag=v.validateAge(11);
		Assert.assertFalse(flag);
	}
	@Test
	public void testForTrue() {
		Validator v=new Validator();
		boolean flag=v.validateAge(20);
		Assert.assertTrue(flag);
	}

}
