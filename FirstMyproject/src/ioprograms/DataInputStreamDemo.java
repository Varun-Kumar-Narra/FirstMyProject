package ioprograms;
import java.io.*;
public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);//Welcome
		int n = dis.readInt();
		System.out.println(n);//25
		double d = dis.readDouble();
		System.out.println(d);//45.5
		dis.close();
		fis.close();

	}

}
