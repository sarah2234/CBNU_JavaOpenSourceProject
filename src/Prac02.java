import java.util.Scanner;

public class Prac02 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(19-99)>> ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		if(a/10 == b/10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
	}

}
