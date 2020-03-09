package proppack;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		
		Properties p=new Properties();
		p.setProperty("url", "jdbc:oracle:thin");
		p.setProperty("username", "system");
		p.setProperty("password", "orcl11g");
		FileOutputStream out = new FileOutputStream("jdbc.properties");
		p.store(out,"Prop Stored");
		out.close();
		
		FileInputStream in = new FileInputStream("jdbc.properties");
		p.load(in);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}
}


