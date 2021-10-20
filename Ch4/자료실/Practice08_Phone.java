package Ch4.자료실;
import java.util.Scanner;

public class Practice08_Phone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>> ");
        int personNum = scanner.nextInt();
        Practice08_PhoneBook[] list = new Practice08_PhoneBook[personNum];
        for(int i = 0; i < personNum; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
            String name = scanner.next();
            String number = scanner.next();
            list[i] = new Practice08_PhoneBook(name, number);
        }
        System.out.println("저장되었습니다...");

        String name = "";
        while(true) {
            System.out.print("검색할 이름>> ");
            name = scanner.next();
            if(name.equals("그만")) break;

            for(int i = 0; i < list.length; i++) {
                if(list[i].getName().equals(name)) {
                    System.out.println(name + "의 번호는 " + list[i].getNumber() + " 입니다.");
                    break;
                }
                if(i == 2) System.out.println(name + " 이 없습니다.");
            }
        }
        scanner.close();
    }
}