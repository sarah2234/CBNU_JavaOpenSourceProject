package Ch5.강의자료;

class Ex01_Point {
    private int x, y;

    public void set(int x, int y) {
        this.x = x; this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class Ex01_ColorPoint extends Ex01_Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}

public class Ex01_ColorPointEx {
    public static void main(String [] args) {
        Ex01_Point p = new Ex01_Point();
        p.set(1, 2);
        p.showPoint();
        Ex01_ColorPoint cp = new Ex01_ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}
