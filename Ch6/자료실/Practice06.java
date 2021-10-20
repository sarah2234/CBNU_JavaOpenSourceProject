package Ch6.자료실;

import java.util.Calendar;
import java.util.Scanner;

class Practice06_Player {
    private String name;
    private int set_time, pressed_time;
    private Calendar calendar;

    public Practice06_Player(String name) {
        this.name = name;
    }

    public int setTime() {
        calendar = Calendar.getInstance();
        set_time = calendar.get(Calendar.SECOND);
        return set_time;
    }

    public int pressedTime() {
        calendar = Calendar.getInstance();
        pressed_time = calendar.get(Calendar.SECOND);
        return pressed_time;
    }

    public int calcTime() {
        if(Math.abs(pressed_time - set_time) != (pressed_time - set_time)) {
            return pressed_time - set_time + 60;
        }
        return pressed_time - set_time;
    }

    public String getName() {
        return name;
    }
}

public class Practice06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Practice06_Player[] players = new Practice06_Player[2];
        players[0] = new Practice06_Player("황기태");
        players[1] = new Practice06_Player("이재문");

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        for(int i = 0; i < 2; i++) {
            System.out.print(players[i].getName() + " 시작 <Enter>키 >> ");
            String enter = scanner.nextLine();
            System.out.println("현재 초 시간 = " + players[i].setTime());
            System.out.print("10초 예상 후 <Enter>키 >> ");
            enter = scanner.nextLine();
            System.out.println("현재 초 시간 = " + players[i].pressedTime());
        }

        System.out.print("황기태의 결과 : " + players[0].calcTime() + ", 이재문의 결과 : " + players[1].calcTime() + ", ");
        if(Math.abs(players[0].calcTime() - 10) < Math.abs(players[1].calcTime() - 10)) System.out.println("승자는 " + players[0].getName());
        else if(Math.abs(players[0].calcTime() - 10) > Math.abs(players[1].calcTime() - 10)) System.out.println("승자는 " + players[1].getName());
        else System.out.println("비겼습니다.");
        scanner.close();
    }
}
