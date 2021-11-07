package Ch8.강의자료;

import java.io.*;
public class Ex11_BlockBinaryCopyEx {
    public static void main(String[] args) {
        File src = new File(".\\Ch8\\강의자료\\Wallpaper\\Sky.jpg");
        File dest = new File(".\\Ch8\\강의자료\\Copy\\Sky_Copy.jpg");
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            byte [] buf = new byte [1024*10]; // 10KB

            while(true) {
                int n = fi.read(buf); // 버퍼 크기만큼 읽기 & n은 실제 읽은 바이트
                fo.write(buf, 0, n); // n 바이트만큼 쓰기
                if(n < buf.length)
                    break;
            }
            fi.close();
            fo.close();
            System.out.println( src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
        } catch (IOException e) { System.out.println("파일 복사 오류"); }
    }
}
