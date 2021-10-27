package Ch7.자료실;

import java.util.*;

public class Practice04_Vector {
    public static void main(String[] args) {
        Vector<Integer> rainfall = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int avg = 0;
            System.out.print("강수량 입력 (0 입력 시 종료)>> ");
            int num = scanner.nextInt();
            if(num == 0) break;
            rainfall.add(num);
            for(int i = 0; i < rainfall.size(); i++) {
                System.out.print(rainfall.get(i) + " ");
                avg += rainfall.get(i);
            }
            avg /= rainfall.size();
            System.out.println();
            System.out.println("현재 평균 " + avg);
        }
    }
}
