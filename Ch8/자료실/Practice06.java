package Ch8.자료실;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Practice06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileReader fileReader1 = null;
        FileReader fileReader2 = null;
        FileWriter fileWriter = null;
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫 번째 파일 이름을 입력하세요>> ");
        String path1 = scanner.nextLine();
        System.out.print("두 번째 파일 이름을 입력하세요>> ");
        String path2 = scanner.nextLine();
        try {
            fileReader1 = new FileReader(path1);
            fileReader2 = new FileReader(path2);
            fileWriter = new FileWriter(".\\Ch8\\자료실\\appended.txt");
            int c;
            while((c = fileReader1.read()) != -1) {
                fileWriter.write(c);
            }

            while((c = fileReader2.read()) != -1) {
                fileWriter.write(c);
            }
            System.out.println("Ch8\\자료실 폴더 안에 appended.txt 파일을 생성하였습니다.");
            fileReader1.close();
            fileReader2.close();
            fileWriter.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
