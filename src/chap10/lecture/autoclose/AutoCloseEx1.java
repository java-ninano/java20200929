package chap10.lecture.autoclose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx1 {
	public static void main(String[] args) {
		// 
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		// new version
		// try-with-resources
		try(FileInputStream fis2 = new FileInputStream("file.txt");
			FileInputStream fis3 = new FileInputStream("file2.txt");	) {
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}