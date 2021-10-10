package Ch5.자료실;

import java.util.Scanner;

abstract class Practice12_Shape {
    private Practice12_Shape next;

    public Practice12_Shape() {
        next = null;
    }

    public void setNext(Practice12_Shape obj){
        next = obj;
    }

    public Practice12_Shape getNext() {
        return next;
    }

    public abstract void draw();
}

class Practice12_Line extends Practice12_Shape {
    public void draw() {
        System.out.println("Line");
    }
}
class Practice12_Rect extends Practice12_Shape {
    public void draw() {
        System.out.println("Rect");
    }
}
class Practice12_Circle extends Practice12_Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class Practice12_GraphicEditor {
    static Practice12_Shape list;
    static int length;

    public Practice12_GraphicEditor() {
        length = 0;
    }

    public static void insert(int i) {
        if(length == 0) {
            switch(i) {
                case 1:
                    list = new Practice12_Line();
                    list.setNext(null);
                    length++;
                    break;
                case 2:
                    list = new Practice12_Rect();
                    list.setNext(null);
                    length++;
                    break;
                case 3:
                    list = new Practice12_Circle();
                    list.setNext(null);
                    length++;
                    break;
                default:
                    System.out.println("잘못된 정보입니다.");
                    break;
            }
            return;
        }

        Practice12_Shape obj = list;
        while(obj.getNext() != null) {
            obj = obj.getNext();
        }

        switch (i) {
            case 1:
                obj.setNext(new Practice12_Line());
                obj.getNext().setNext(null);
                length++;
                break;
            case 2:
                obj.setNext(new Practice12_Rect());
                obj.getNext().setNext(null);
                length++;
                break;
            case 3:
                obj.setNext(new Practice12_Circle());
                obj.getNext().setNext(null);
                length++;
                break;
            default:
                System.out.println("잘못된 정보입니다.");
                break;
        }
    }

    public static void delete(int i) {
        if(length < i)
        {
            System.out.println("삭제할 수 없습니다.");
            return;
        }
        else if(i == 1) {
            list=list.getNext();
            return;
        }

        Practice12_Shape obj = list;
        for(int k = 0; k < i - 2; k++) {
            obj = obj.getNext();
        }
        obj.setNext(obj.getNext().getNext());
    }

    public static void lookup() {
        Practice12_Shape obj = list;
        while(obj != null) {
            obj.draw();
            obj = obj.getNext();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        int menu;
        do {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>> ");
                    menu = scanner.nextInt();
                    insert(menu);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>> ");
                    menu = scanner.nextInt();
                    delete(menu);
                    break;
                case 3:
                    lookup();
                    break;
                case 4:
                    System.out.println("beauty를 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 값입니다.");
                    break;

            }
        } while(menu != 4);

        scanner.close();
    }
}
