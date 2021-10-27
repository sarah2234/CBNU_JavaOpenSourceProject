package Ch7.자료실;

import java.util.*;

public class Practice02_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> grade = new ArrayList<>();
        char c;
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
        for(int i = 0; i < 6; i++) {
            c = scanner.next().trim().charAt(0);
            grade.add(c);
        }
        double sum = 0;
        for(int i = 0; i < grade.size(); i++) {
            switch(grade.get(i)) {
                case 'A':
                    sum += 4.0;
                    break;
                case 'B':
                    sum += 3.0;
                    break;
                case 'C':
                    sum += 2.0;
                    break;
                case 'D':
                    sum += 1;
                    break;
            }
        }
        sum /= grade.size();
        System.out.println(sum);
    }
}
