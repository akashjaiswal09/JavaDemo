package iopack;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;


public class BufferInputDemo {
	public static void main(String[] args) throws Exception  {

		FileInputStream fis = new FileInputStream("test1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		bis.close();
		fis.close();
		dis.close();
}
}
