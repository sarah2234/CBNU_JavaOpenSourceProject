package Ch4.수업;
import java.util.Scanner;

public class Ex12_StaticMember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러)>> ");
        double rate = scanner.nextDouble();
        Ex12_CurrencyConverter.setRate(rate);
        System.out.println("백만원은 $" + Ex12_CurrencyConverter.toDollar(1000000) + "입니다.");
        System.out.println("$100는 " + Ex12_CurrencyConverter.toKWR(100) + "원입니다.");
        scanner.close();
    }
}
