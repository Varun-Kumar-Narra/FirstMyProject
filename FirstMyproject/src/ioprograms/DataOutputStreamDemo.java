package ioprograms;
import java.io.*;
public class DataOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Welcome");//Unified Text Format
		dos.writeInt(25);
		dos.writeDouble(45.5);
		System.out.println("File Created");
		dos.close();
		fos.close();
	}

}
