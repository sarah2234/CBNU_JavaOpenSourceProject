import java.util.Scanner;

public class Prac10 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("ù ��° ���� �߽ɰ� ������ �Է�>> ");
		int x1=scanner.nextInt();
		int y1=scanner.nextInt();
		int r1=scanner.nextInt();
		
		System.out.print("�� ��° ���� �߽ɰ� ������ �Է�>> ");
		int x2=scanner.nextInt();
		int y2=scanner.nextInt();
		int r2=scanner.nextInt();
		
		if((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) <= (r1 + r2) * (r1 + r2)) {
			System.out.println("�� ���� ���� ��ģ��.");
		}
	}
}
