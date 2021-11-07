package Ch8.자료실;

import java.io.*;

public class Practice08 {
    public static void main(String[] args) {
        File dir = new File("c:\\");
        File[] files = dir.listFiles();
        File max_length = files[0];
        for(int i = 1; i < files.length; i++) {
            if(max_length.length() < files[i].length()) {
                max_length = files[i];
            }
        }
        System.out.println("가장 큰 파일은 " + max_length.getPath() + " " + max_length.length() + "바이트");
    }
}
