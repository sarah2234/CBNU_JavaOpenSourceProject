package Ch6.강의자료;

class Ex02_Point {
    int x, y;

    public Ex02_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() { // Object의 toString 메소드(클래스 이름 + @ + 해시코드의 16진수 표현) 오버라이딩
        return "Ex02_Point(" + x + "," + y + ")";
    }
}
public class Ex02_ToStringEx {
    public static void main(String [] args) {
        Ex02_Point p = new Ex02_Point(2,3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p + "입니다.");
    }
}