package in.railworld;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f);
		System.out.println(f.exists());
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
		
//		****
		File f1 = new File("D:\\New folder\\abc.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f1.exists());
		
//		****
		File f3 = new File("d://myfiles2");
		f3.mkdir();
		System.out.println(f3.exists());
		System.out.println(f3);
		
//		****
		FileWriter fw = new FileWriter("D:\\myfiles2\\abc.txt");
		fw.write(100);//d will be added
		fw.write("ramesh\nwelcome");
		fw.write("\n");
		fw.write("india");
		fw.write("\n");
		char ch[]={'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
		System.out.println("done");
	}
	
}
