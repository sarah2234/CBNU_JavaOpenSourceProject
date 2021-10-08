package Ch3.자료실;
import java.util.Scanner;

public class Prac06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        System.out.print("금액을 입력하시오>> ");
        int a=scanner.nextInt();
        for(int num:unit) {
            if(a/num!=0) {
                System.out.println(num+"원 짜리 : "+a/num+"개");
            }
            a%=num;
        }
    }
}
