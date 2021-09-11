import java.util.Scanner;

public class Prac06 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("1~99 »çÀÌ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>> ");
		int a=scanner.nextInt();
		int cnt=0;
		if((a / 10) % 3 == 0) {
			cnt++;
		}
		if((a % 10) % 3 == 0) {
			cnt++;
		}
		
		if(cnt == 1) {
			System.out.println("¹Ú¼öÂ¦");
		}
		else if(cnt == 2) {
			System.out.println("¹Ú¼öÂ¦Â¦");
		}
		else if(cnt == 3) {
			System.out.println("¹Ú¼öÂ¦Â¦Â¦");
		}
	}

}
