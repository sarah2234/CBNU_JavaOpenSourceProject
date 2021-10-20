package Ch4.자료실;
import java.util.Scanner;

public class Practice08_PhoneBook {
    private String name;
    private String number;
    public Practice08_PhoneBook(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}