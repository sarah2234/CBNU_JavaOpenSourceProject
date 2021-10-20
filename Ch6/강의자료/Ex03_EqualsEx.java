package Ch6.강의자료;

class Ex03_Point {
    int x, y;

    public Ex03_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        Ex03_Point p = (Ex03_Point)obj;

        if(x == p.x && y == p.y) return true;
        else return false;
    }
}

public class Ex03_EqualsEx {
    public static void main(String[] args) {
        Ex03_Point a = new Ex03_Point(2,3);
        Ex03_Point b = new Ex03_Point(2,3);
        Ex03_Point c = new Ex03_Point(3,4);
        if(a == b) // false
            System.out.println("a==b");
        if(a.equals(b)) // true
            System.out.println("a is equal to b");
        if(a.equals(c)) // false
            System.out.println("a is equal to c");
    }
}
