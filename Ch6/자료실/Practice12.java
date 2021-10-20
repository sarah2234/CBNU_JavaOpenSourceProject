package Ch6.자료실;

import java.util.*;

class Practice12_Person {
    String name;

    public Practice12_Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int i = 0;
        int[] num = new int[3];

        System.out.print("갬블링 게임에 참여할 선수 숫자>> ");
        int n = scanner.nextInt();

        Practice12_Person[] people = new Practice12_Person[n];

        for(i = 0; i < n; i++) {
            System.out.print((i + 1) + "번째 선수 이름>> ");
            s = scanner.next();
            people[i] = new Practice12_Person(s);
        }
        s = scanner.nextLine();

        i = 0;
        do {
            System.out.print("[" + people[i].getName() + "]:<Enter>");
            s = scanner.nextLine();
            for(int j = 0; j < 3; j++) {
                num[j] = (int)(Math.random() * 3) + 1;
            }
            System.out.print(num[0] + " " + num[1] + " " + num[2] + " ");
            if(num[0] == num[1] && num[1] == num[2]) {
                System.out.println(people[i].getName() + "님이 이겼습니다!");
            }
            else {
                System.out.println("아쉽군요!");
            }
            i = (i + 1) % n;
        } while(!(num[0] == num[1] && num[1] == num[2]));
    }
}
