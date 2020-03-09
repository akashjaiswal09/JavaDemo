package iopack;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputDemo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("emp.txt");
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e =(Employee)ois.readObject();
		
		System.out.println(e.getEid()+" "+e.getEname());
	}

}
