package Ch8.강의자료;

import java.io.*;

public class Ex03_FileReadHangulFail {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(".\\Ch8\\강의자료\\hangul.txt");
            in = new InputStreamReader(fin, "US-ASCII");
            int c;
            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }
            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}