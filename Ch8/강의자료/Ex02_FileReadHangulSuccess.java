package Ch8.강의자료;

import java.io.*;

public class Ex02_FileReadHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        // 메모장 인코딩 방식 ANSI로 맞추기
        try {
            fin = new FileInputStream(".\\Ch8\\강의자료\\hangul.txt"); // 상대 경로의 기준은 클래스 파일이 포함된 프로젝트 폴더
            in = new InputStreamReader(fin, "MS949");
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
