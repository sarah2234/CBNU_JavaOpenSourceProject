package Ch6.강의자료;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Ex01_ObjectPropertyEx {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString()); // 객체를 문자열로 만들기
        System.out.println(obj); // 객체 출력
    }
    public static void main(String [] args) {
        Point p = new Point(2,3);
        print(p);
    }
}
