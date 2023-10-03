package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task {
	public static void main(String[] args) throws IOException {
//		String a="mohan";
//		System.out.println(a.indexOf("x"));
		File f=new File("C:\\Users\\LENOVO\\Desktop\\program\\name1.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.println((char)(temp));
		}
	}

}
