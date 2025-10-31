package ioprograms;
import java.io.*;
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("xyz.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String str = "Java is OO Programming Language";
		bw.write(str);
		System.out.println("File Created");
		bw.close();
		fw.close();
	}

}
