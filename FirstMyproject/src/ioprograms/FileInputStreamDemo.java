package ioprograms;
import java.io.*;
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("pqr.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int size = bis.available();//returns the size of the file
		byte[] buffer = new byte[size];
		bis.read(buffer);
		String str = new String(buffer);//converts byte[] into String
		System.out.println(str);
		bis.close();
		fis.close();
	}

}
