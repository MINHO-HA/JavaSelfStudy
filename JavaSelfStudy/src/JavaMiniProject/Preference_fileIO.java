package JavaMiniProject;

import java.io.FileWriter;
import java.io.IOException;

public class Preference_fileIO {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\test\\test.txt");
		for (int i = 1; i < 11; i++) {
			String data = i + " 번째 줄입니다.\r\n";
			fw.write(data);
		}
		fw.close();
	
		FileWriter fw2 = new FileWriter("D:\\test\\test.txt");
		for (int i = 11; i < 22; i++) {
			String data = i+ " 번째 줄입니다.\r\n";
			fw2.write(data);
		}
		fw.close();
	
	
	
	}
	
		
}
