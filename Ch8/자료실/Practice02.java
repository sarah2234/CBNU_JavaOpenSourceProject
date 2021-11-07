package Ch8.자료실;

import java.util.*;
import java.io.*;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;
        System.out.println("전화번호 입력 프로그램입니다.");
        try {
            fout = new FileWriter(".\\Ch8\\자료실\\phone.txt");

            while(true) {
                System.out.print("이름 전화번호 >> ");
                String line = scanner.nextLine();
                if(line.equals("그만"))
                    break;
                fout.write(line, 0, line.length()); // 배열 b[off]부터 len 바이트를 해당 출력 스트림에 저장
                fout.write("\r\n", 0, 2);
            }

            fout.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }

        FileReader file = null;
        try {
            file = new FileReader(".\\Ch8\\자료실\\phone.txt");
            System.out.println(".\\Ch8\\자료실\\phone.txt를 출력합니다.");
            int c;

            while ((c = file.read()) != -1) {
                System.out.print((char)c);
            }
            file.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
        scanner.close();
    }
}
