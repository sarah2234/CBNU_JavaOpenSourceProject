package Ch3;
import java.util.Scanner;

public class Prac16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String user;
        String str[]={"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        do {
            System.out.print("가위 바위 보!>> ");
            user = scanner.next();
            int n = (int) (Math.random() * 3);

            if (user.equals(str[n])) {
                System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[n] + " , 비겼습니다.");
            }
            else if ((user.equals("가위") && n == 2) || (user.equals("바위") && n == 0) || (user.equals("보") && n == 1)) {
                System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[n] + " , 이겼습니다.");
            }
            else if(!user.equals("그만")) {
                System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[n] + " , 졌습니다.");
            }
        } while(!user.equals("그만"));
        System.out.println("게임을 종료합니다...");
    }
}
