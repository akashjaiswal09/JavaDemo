package iopack;

import java.io.FileWriter;

public class CharOutputDemo {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("test4.txt");
		fw.write("akash");
		fw.close();

		
	}

}
