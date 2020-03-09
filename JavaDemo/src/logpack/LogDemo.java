package logpack;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogDemo {
	static Logger logger = Logger.getLogger("logdemo");

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		new LogDemo().businessMethod1();

	}
	
	public void businessMethod1() {
		
		logger.debug("Debug message");
		logger.info("Info message");
	}
	
	public void businessMethod2() {
		
	}

}
