package Ch2.자료실;
import java.util.Scanner;

public class Prac06 {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>> ");
        int a=scanner.nextInt();
        int cnt=0;
        if((a / 10) % 3 == 0) {
            cnt++;
        }
        if((a % 10) % 3 == 0) {
            cnt++;
        }

        if(cnt == 1) {
            System.out.println("박수짝");
        }
        else if(cnt == 2) {
            System.out.println("박수짝짝");
        }
    }

}
