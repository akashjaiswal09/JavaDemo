package com.capgemini.fileio81;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class ReverseFileWriter {

	public static void main(String[] args) throws Exception {
		
	FileOutputStream fos = new FileOutputStream("file1.txt");
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	bos.write('a');
	bos.write('k');
	bos.write('a');
	bos.write('s');
	bos.write('h');
	bos.close();
	}
}


