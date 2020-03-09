package iopack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputDemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("akash");
		oos.writeObject(e1);
		
		oos.close();
		fos.close();
		

	}

}
