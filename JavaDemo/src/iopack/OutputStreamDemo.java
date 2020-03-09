package iopack;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {


	public static void main(String[] args) throws IOException {
	
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test1.txt");
			fos.write(100);
			fos.write('A');
			fos.write(120);
			fos.write(676);
			fos.close();
		}
		finally {
			if (fos!=null) {
				fos.close();
		}	
		}
	}
}
