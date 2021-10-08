package Ch5.강의자료;

class Ex03_Point {
    private int x, y;

    public Ex03_Point() {
        this.x = this.y = 0;
    }

    public Ex03_Point(int x, int y) {
        this.x = x; this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}
class Ex03_ColorPoint extends Ex03_Point {
    private String color;

    public Ex03_ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}

public class Ex03_SuperEx {
    public static void main(String[] args) {
        Ex03_ColorPoint cp = new Ex03_ColorPoint(5, 6, "blue");
        cp.showColorPoint();
    }
}
