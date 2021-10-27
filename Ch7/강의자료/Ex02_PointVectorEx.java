package Ch7.강의자료;

import java.util.Vector;

class Ex02_Point {
    private int x, y;

    public Ex02_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class Ex02_PointVectorEx {
    public static void main(String[] args) {
        Vector<Ex02_Point> v = new Vector<Ex02_Point>();
        v.add(new Ex02_Point(2, 3));
        v.add(new Ex02_Point(-5, 20));
        v.add(new Ex02_Point(30, -8));
        v.remove(1);

        for(int i = 0; i < v.size(); i++) {
            Ex02_Point p = v.get(i);
            System.out.println(p);
        }
    }
}
