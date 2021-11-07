package Ch8.자료실;

import java.io.*;
import java.util.*;

public class Practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileReader fileReader = null;
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("대상 파일명 입력>> ");
        String file = scanner.next();
        try {
            while (true) {
                fileReader = new FileReader(file);
                System.out.print("검색할 단어나 문장>> ");
                String word = scanner.next();
                if (word.equals("그만"))
                    break;
                int c, lineNum = 0;
                String line = "";
                int correct = 0;
                Vector<String> results = new Vector<>();
                while((c = fileReader.read()) != -1) {
                    line += (char)c;
                    if(word.length() > correct && c == word.charAt(correct)) {
                        correct++;
                    }
                    else if(word.length() > correct && c != word.charAt(correct)) {
                        correct = 0;
                    }
                    if(c == '\n') {
                        if(correct == word.length()) {
                            System.out.println(lineNum + ": " + line);
                            correct = 0;
                        }
                        lineNum++;
                        line = "";
                    }
                }
            }
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
