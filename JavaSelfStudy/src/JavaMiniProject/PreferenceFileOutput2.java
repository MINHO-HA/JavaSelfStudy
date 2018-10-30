package JavaMiniProject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PreferenceFileOutput2 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	String h = sc.next();
        FileWriter fw = new FileWriter("D:/test1/"+h+".txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.";
            fw.write(data);
        }
        fw.close();
    }
}
