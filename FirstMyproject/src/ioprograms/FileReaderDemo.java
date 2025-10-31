package ioprograms;
import java.io.*;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/JobPrep/Java/Eclipse_Workspace/FirstMyProject/src/ioprograms/FileReaderDemo.java");
		int n;
		while ((n = fr.read()) != -1) //-1 indicates EOF (End Of File)
			System.out.print((char)n);
		fr.close();
		/*
		System.out.println();
		char c = 'p';
		System.out.println((int)c);//112 - UNICODE of char 'p'
		*/
	}

}
