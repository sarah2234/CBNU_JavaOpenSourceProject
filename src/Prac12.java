import java.util.Scanner;

public class Prac12 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("����>> ");
		int a=scanner.nextInt();
		String s=scanner.next();
		int b=scanner.nextInt();
		int ans = 0;
		
		if(s.equals("+")) {
			ans=a+b;
			
		}
		else if(s.equals("-")) {
			ans=a-b;
		}
		else if(s.equals("*")) {
			ans=a*b;
		}
		else if(s.equals("/")) {
			if(b==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				return;
			}
			else {
				ans=a/b;
			}
		}
		System.out.println(a+s+b+"�� ��� ����� "+ans);
	}
}
