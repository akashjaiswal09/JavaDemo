package iopack;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class BufferOutputDemo {

	public static void main(String[] args) throws Exception {
		
		ch=fr.read()
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		dos.writeInt(101);
		dos.writeFloat(50.5f);
		dos.writeBoolean(true);
		dos.writeDouble(33.3);
		dos.close();
	}

}
