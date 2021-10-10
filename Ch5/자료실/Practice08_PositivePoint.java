package Ch5.자료실;

class Practice08_Point {
    private int x, y;

    public Practice08_Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    protected void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Practice08_PositivePoint extends Practice08_Point {
    public Practice08_PositivePoint() {
        super(0, 0);
    }

    public Practice08_PositivePoint(int x, int y) {
        super(x, y);
        if (x < 0) x = 0;
        if (y < 0) y = 0;
        move(x, y);
    }

    public void move(int x, int y) {
        if(x >= 0 && y >= 0) super.move(x, y);
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ") 의 점";
    }

    public static void main(String[] args) {
        Practice08_PositivePoint p = new Practice08_PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, 5);
        System.out.println(p.toString() + "입니다.");

        Practice08_PositivePoint p2 = new Practice08_PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
