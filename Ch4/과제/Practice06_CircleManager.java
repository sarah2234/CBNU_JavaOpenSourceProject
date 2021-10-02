package Ch4.과제;
import java.util.Scanner;

public class Practice06_CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Practice06_Circle c[] = new Practice06_Circle[3];
        for(int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius>> ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Practice06_Circle(x, y, radius);
        }

        Practice06_Circle maxArea = c[0];

        for(int i = 0; i < c.length; i++) {
            c[i].show();
            if(c[i].getRadius() > maxArea.getRadius()) maxArea = c[i];
        }
        System.out.print("가장 면적이 큰 원은 ");
        maxArea.show();

        scanner.close();
    }
}
