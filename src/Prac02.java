import java.util.Scanner;

public class Prac02 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(19-99)>> ");
		int a=scanner.nextInt();
		
		if(a/10 == a%10) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
	}

}
