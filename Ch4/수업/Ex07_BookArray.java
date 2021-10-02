package Ch4.수업;
import java.util.Scanner;

public class Ex07_BookArray {
    public static void main(String[] args) {
        Ex07_Book [] book = new Ex07_Book[2];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<book.length; i++) {
            System.out.print("제목>> ");
            String title = scanner.nextLine();
            System.out.print("저자>> ");
            String author = scanner.nextLine();
            book[i] = new Ex07_Book(title, author);
        }

        for(int i=0; i<book.length; i++) {
            System.out.print("(" + book[i].title + ", " + book[i].author + ") ");
        }

        scanner.close();
    }
}
