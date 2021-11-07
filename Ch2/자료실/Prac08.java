package Ch2.자료실;

import java.util.Scanner;

public class Prac08 {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("점 (x1, y1)의 좌표를 입력하시오>> ");
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();

        System.out.print("점 (x2, y2)의 좌표를 입력하시오>> ");
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();

        if((x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200)
                || (x1 >= 100 && x1 <= 200) && (y2 >= 100 && y2 <= 200)
                || (x2 >= 100 && x2 <= 200) && (y1 >= 100 && y1 <= 200)
                || (x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200)) {
            System.out.println("(100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌합니다.");
        }
    }

}

