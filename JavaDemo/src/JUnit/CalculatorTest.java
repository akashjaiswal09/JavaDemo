package JUnit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {
	private Calculator calculator;
	private int input1;
	private int input2;
	private int expectedSum;

	@Parameters
	public static Collection<Object[]> testData(){
		return Arrays.asList(new Object[][]{
			{0,0,0},{1,0,1},{10,5,15}
		});
	}
	public static void main(String[] args) {
		int actualSum=

	}

}
