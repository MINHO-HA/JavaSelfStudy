package JavaMiniProject;

import java.io.IOException;
import java.io.PrintWriter;

public class PreferenceFileOutput {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("D:/test1/111111.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();
    }
}

