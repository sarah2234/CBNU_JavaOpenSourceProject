package Ch6.자료실;

import java.util.*;

class Practice10_Person {
    String name;

    public Practice10_Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Practice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Practice10_Person[] people = new Practice10_Person[2];
        String s;
        int i = 0;
        int[] num = new int[3];

        for(i = 0; i < 2; i++) {
            System.out.print((i + 1) + "번째 선수 이름>> ");
            s = scanner.nextLine();
            people[i] = new Practice10_Person(s);
        }

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
            i = (i + 1) % 2;
        } while(!(num[0] == num[1] && num[1] == num[2]));
    }
}
