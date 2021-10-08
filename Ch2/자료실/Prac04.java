package Ch2.자료실;
import java.util.Scanner;

public class Prac04 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int mid;

		if((b < a && a < c) || (c < a && a < b)) {
			mid=a;
		}
		else if((a < b && b < c) || (c < b && b < a)) {
			mid=b;
		}
		else {
			mid=c;
		}
		System.out.println("중간 값은 " + mid);
	}

}
