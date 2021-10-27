package Ch7.자료실;

import java.util.*;

abstract class Practice10_Shape {
    public abstract void draw();
}

class Practice10_Line extends Practice10_Shape {
    public void draw() {
        System.out.println("Line");
    }
}

class Practice10_Rect extends Practice10_Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

class Practice10_Circle extends Practice10_Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class Practice10_Vector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Practice10_Shape> shape = new Vector<>();
        int menu = 0;
        System.out.println("그래픽 에디터 beauty를 실행합니다.");

        do {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>> ");
                    menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            shape.add(new Practice10_Line());
                            break;
                        case 2:
                            shape.add(new Practice10_Rect());
                            break;
                        case 3:
                            shape.add(new Practice10_Circle());
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>> ");
                    menu = scanner.nextInt();
                    if(menu >= shape.size()) {
                        System.out.println("삭제할 수 없습니다.");
                        break;
                    }
                    shape.remove(menu - 1);
                    System.out.println("삭제를 완료하였습니다.");
                    break;
                case 3:
                    for(Practice10_Shape s : shape) {
                        s.draw();
                    }
                    break;
                case 4:
                    System.out.println("beauty를 종료합니다.");
                    break;
            }
        } while(menu != 4);
    }
}
