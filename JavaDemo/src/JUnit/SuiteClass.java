package JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({OddOrEvenTest.class,ValidatorTest.class})
public class SuiteClass {

}
