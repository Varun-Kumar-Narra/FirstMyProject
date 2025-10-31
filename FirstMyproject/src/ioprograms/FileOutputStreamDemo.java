package ioprograms;
import java.io.*;
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("pqr.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "Hibernate is an ORM Framework";
		bos.write(str.getBytes());//converts String into byte[]
		System.out.println("File Created");
		bos.close();
		fos.close();
	}

}
