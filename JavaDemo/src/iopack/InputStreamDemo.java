package iopack;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("test1.txt");
		
		int value=fis.read();
		while(value!=-1) {
			System.out.println(value);
			value=fis.read();
		}

	}

}
