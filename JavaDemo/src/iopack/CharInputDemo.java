package iopack;

import java.io.FileReader;

public class CharInputDemo {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("test4.txt");
		int ch=fr.read();
		while(ch!=-1) {
			System.out.println((char)ch);
			ch=fr.read();
		}
		fr.close();
	}

}
