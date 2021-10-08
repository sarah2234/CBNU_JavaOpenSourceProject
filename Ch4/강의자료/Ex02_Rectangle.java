package Ch4.강의자료;
import java.util.Scanner;

public class Ex02_Rectangle {
    int width;
    int height;
    public int getArea() {
        return width*height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex02_Rectangle rect = new Ex02_Rectangle();
        System.out.print(">> ");
        rect.width = scanner.nextInt();
        System.out.print(">> ");
        rect.height = scanner.nextInt();

        System.out.println("사각형의 면적은 " + rect.getArea());
        scanner.close(); // 파일 내용을 읽은 후 Scanner 닫기
    }
}
