package Ch8.강의자료;

import java.io.*;
public class Ex10_BinaryCopyEx {
    public static void main(String[] args) {
        File src = new File(".\\Ch8\\강의자료\\Wallpaper\\Wallpaper.jpg");
        File dest = new File(".\\Ch8\\강의자료\\Copy\\Wallpaper_Copy.jpg");
        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            while((c = fi.read()) != -1) {
                fo.write((byte)c);
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}

