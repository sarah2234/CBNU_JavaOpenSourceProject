package Ch6.자료실;

class Practice02_Circle {
    int x, y, radius;

    public Practice02_Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean equals(Practice02_Circle c) {
        if(c.x == this.x && c.y == this.y) return true;
        else return false;
    }

    public String toString() {
        return "Circle(" + x + ", " + y + ")반지름" + radius;
    }
}

public class Practice02 {
    public static void main(String[] args) {
        Practice02_Circle a = new Practice02_Circle(2, 3, 5);
        Practice02_Circle b = new Practice02_Circle(2, 3, 50);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b)) System.out.println("같은 원");
        else System.out.println("다른 원");
    }
}

