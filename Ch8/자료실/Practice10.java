package Ch8.자료실;

import java.io.*;
import java.util.*;
import java.util.HashMap;

public class Practice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();
        try {
            FileReader fileReader = new FileReader(".\\Ch8\\자료실\\phone2.txt");
            int c, toggle = 0;
            String name = "", phoneNum = "";
            while((c = fileReader.read()) != -1) {
                if((char)c == ' ') {
                    toggle = 1;
                }
                else if((char)c == '\n') {
                    toggle = 0;
                    phonebook.put(name, phoneNum);
                    name = "";
                    phoneNum = "";
                }
                else if(toggle == 0) {
                    name += (char)c;
                }
                else if(toggle == 1) {
                    phoneNum += (char)c;
                }

            }
            System.out.println("총 " + phonebook.size() + "개의 전화번호를 읽었습니다.");
            while(true) {
                System.out.print("이름>> ");
                String searchName = scanner.next();
                if(searchName.equals("그만"))
                    break;
                String searchNum = phonebook.get(searchName);
                if (searchNum != null) {
                    System.out.println(searchNum);
                } else {
                    System.out.println("찾는 이름이 없습니다.");
                }
            }
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
