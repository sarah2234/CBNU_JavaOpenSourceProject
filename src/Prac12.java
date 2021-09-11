import java.util.Scanner;

public class Prac12 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("연산>> ");
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
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			else {
				ans=a/b;
			}
		}
		System.out.println(a+s+b+"의 계산 결과는 "+ans);
	}
}
