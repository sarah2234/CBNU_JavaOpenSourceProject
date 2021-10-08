package Ch4.자료실;
import java.util.Scanner;

public class Practice08_PhoneBook {
    private String name;
    private String number;
    public Practice08_PhoneBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
        name = scanner.next();
        number = scanner.next();
        scanner.close();
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
